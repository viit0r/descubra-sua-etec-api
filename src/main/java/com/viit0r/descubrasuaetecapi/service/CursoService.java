package com.viit0r.descubrasuaetecapi.service;

import com.viit0r.descubrasuaetecapi.exception.exceptions.NaoEncontradoException;
import com.viit0r.descubrasuaetecapi.model.db.Curso;
import com.viit0r.descubrasuaetecapi.model.db.RelacaoUnidadeCurso;
import com.viit0r.descubrasuaetecapi.model.dto.CursoDTO;
import com.viit0r.descubrasuaetecapi.model.dto.RelacaoCursoDTO;
import com.viit0r.descubrasuaetecapi.model.request.FiltroRequest;
import com.viit0r.descubrasuaetecapi.model.response.CursoResponse;
import com.viit0r.descubrasuaetecapi.repository.CursoRepository;
import com.viit0r.descubrasuaetecapi.repository.RelacaoUnidadeCursoRepository;
import com.viit0r.descubrasuaetecapi.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private RelacaoUnidadeCursoRepository unidadeCursoRepository;

    public CursoResponse getAllCursos() {
        List<Curso> cursos = cursoRepository.findAll();

        if (cursos.isEmpty()) {
            throw new NaoEncontradoException("Não foram encontrados registros de curso.", Util.CODIGO_ERRO_NAO_ENCONTRADO);
        }

        List<CursoDTO> cursosRetorno = new ArrayList<>();

        for (Curso curso : cursos) {
            List<RelacaoCursoDTO> cursoUnidades = getAllUnidadesByCurso(curso);

            cursosRetorno.add(CursoDTO.add(curso, cursoUnidades));
        }

        return new CursoResponse(cursosRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    public CursoResponse getCurso(Long idCurso) {
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new NaoEncontradoException(String.format("Não foram encontrados registros de curso com o ID %d.", idCurso), Util.CODIGO_ERRO_NAO_ENCONTRADO));

        List<RelacaoCursoDTO> cursoUnidades = getAllUnidadesByCurso(curso);

        CursoDTO cursoRetorno = CursoDTO.add(curso, cursoUnidades);

        return new CursoResponse(cursoRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    public CursoResponse getCursosByFiltro(FiltroRequest filtroRequest) {
        List<Curso> cursos = cursoRepository.findByNomeContainingIgnoreCase(filtroRequest.getFiltro());

        if (cursos.isEmpty()) {
            throw new NaoEncontradoException("Não foram encontrados registros de curso.", Util.CODIGO_ERRO_NAO_ENCONTRADO);
        }

        List<CursoDTO> cursosRetorno = new ArrayList<>();

        for (Curso curso : cursos) {
            List<RelacaoCursoDTO> cursoUnidades = getAllUnidadesByCurso(curso);

            cursosRetorno.add(CursoDTO.add(curso, cursoUnidades));
        }

        return new CursoResponse(cursosRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    private List<RelacaoCursoDTO> getAllUnidadesByCurso(Curso curso) {
        List<RelacaoUnidadeCurso> cursoUnidades = unidadeCursoRepository.findByIdCurso(curso);

        return RelacaoCursoDTO.mapForCurso(cursoUnidades);
    }
}
