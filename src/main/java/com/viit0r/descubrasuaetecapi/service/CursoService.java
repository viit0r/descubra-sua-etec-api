package com.viit0r.descubrasuaetecapi.service;

import com.viit0r.descubrasuaetecapi.exception.exceptions.NaoEncontradoException;
import com.viit0r.descubrasuaetecapi.model.db.Curso;
import com.viit0r.descubrasuaetecapi.model.dto.CursoDTO;
import com.viit0r.descubrasuaetecapi.model.response.curso.CursoResponse;
import com.viit0r.descubrasuaetecapi.repository.CursoRepository;
import com.viit0r.descubrasuaetecapi.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoResponse getAllCursos() {
        List<Curso> cursos = cursoRepository.findAll();

        if (cursos.isEmpty()) {
            throw new NaoEncontradoException("Não foram encontrados registros de curso.", Util.CODIGO_ERRO_CURSO_NAO_ENCONTRADO);
        }

        List<CursoDTO> cursosRetorno = cursos.stream().map(CursoDTO::new).toList();

        return new CursoResponse(cursosRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    public CursoResponse getCurso(Long idCurso) {
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new NaoEncontradoException(String.format("Não foram encontrados registros de curso com o ID %d.", idCurso), Util.CODIGO_ERRO_CURSO_NAO_ENCONTRADO));

        CursoDTO cursoRetorno = new CursoDTO(curso);

        return new CursoResponse(cursoRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }
}
