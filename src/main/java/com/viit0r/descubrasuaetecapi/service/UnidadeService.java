package com.viit0r.descubrasuaetecapi.service;

import com.viit0r.descubrasuaetecapi.exception.exceptions.NaoEncontradoException;
import com.viit0r.descubrasuaetecapi.model.db.RelacaoUnidadeCurso;
import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import com.viit0r.descubrasuaetecapi.model.dto.RelacaoUnidadeDTO;
import com.viit0r.descubrasuaetecapi.model.dto.UnidadeDTO;
import com.viit0r.descubrasuaetecapi.model.request.FiltroRequest;
import com.viit0r.descubrasuaetecapi.model.response.UnidadeResponse;
import com.viit0r.descubrasuaetecapi.repository.RelacaoUnidadeCursoRepository;
import com.viit0r.descubrasuaetecapi.repository.UnidadeRepository;
import com.viit0r.descubrasuaetecapi.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnidadeService {

    @Autowired
    private UnidadeRepository unidadeRepository;

    @Autowired
    private RelacaoUnidadeCursoRepository unidadeCursoRepository;

    public UnidadeResponse getAllUnidades() {
        List<Unidade> unidades = unidadeRepository.findAll();

        if (unidades.isEmpty()) {
            throw new NaoEncontradoException("Não foram encontrados registros de unidades.", Util.CODIGO_ERRO_CURSO_NAO_ENCONTRADO);
        }

        List<UnidadeDTO> unidadesRetorno = new ArrayList<>();

        for (Unidade unidade : unidades) {
            List<RelacaoUnidadeDTO> unidadeCursos = getAllCursosByUnidade(unidade);

            unidadesRetorno.add(UnidadeDTO.add(unidade, unidadeCursos));
        }

        return new UnidadeResponse(unidadesRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    public UnidadeResponse getUnidade(Long idUnidade) {
        Unidade unidade = unidadeRepository.findById(idUnidade)
                .orElseThrow(() -> new NaoEncontradoException(String.format("Não foram encontrados registros de unidade com o ID %d.", idUnidade), Util.CODIGO_ERRO_CURSO_NAO_ENCONTRADO));

        List<RelacaoUnidadeDTO> unidadeCursos = getAllCursosByUnidade(unidade);

        UnidadeDTO unidadeRetorno = UnidadeDTO.add(unidade, unidadeCursos);

        return new UnidadeResponse(unidadeRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    public UnidadeResponse getUnidadesByFiltro(FiltroRequest filtroRequest) {
        List<Unidade> unidades = unidadeRepository.findByNomeContainingIgnoreCase(filtroRequest.getFiltro());

        if (unidades.isEmpty()) {
            throw new NaoEncontradoException("Não foram encontrados registros de curso.", Util.CODIGO_ERRO_CURSO_NAO_ENCONTRADO);
        }

        List<UnidadeDTO> unidadesRetorno = new ArrayList<>();

        for (Unidade unidade : unidades) {
            List<RelacaoUnidadeDTO> unidadeCursos = getAllCursosByUnidade(unidade);

            unidadesRetorno.add(UnidadeDTO.add(unidade, unidadeCursos));
        }

        return new UnidadeResponse(unidadesRetorno, Util.CODIGO_REQUISICAO_OK, true);
    }

    private List<RelacaoUnidadeDTO> getAllCursosByUnidade(Unidade unidade) {
        List<RelacaoUnidadeCurso> unidadeCursos = unidadeCursoRepository.findByIdUnidade(unidade);

        return RelacaoUnidadeDTO.mapForUnidade(unidadeCursos);
    }
}
