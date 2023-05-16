package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.RelacaoUnidadeCurso;
import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import lombok.Data;

import java.util.List;

@Data
public class RelacaoCursoDTO {

    public RelacaoCursoDTO(RelacaoUnidadeCurso relacaoUnidadeCurso) {
        this.unidade = relacaoUnidadeCurso.getIdUnidade();
        this.modalidadePresencial = relacaoUnidadeCurso.isModalidadePresencial();
        this.modalidadeSemipresencial = relacaoUnidadeCurso.isModalidadeSemipresencial();
        this.modalidadeOnline = relacaoUnidadeCurso.isModalidadeOnline();
        this.modalidadeEtim = relacaoUnidadeCurso.isModalidadeEtim();
        this.modalidadeEspecializacao = relacaoUnidadeCurso.isModalidadeEspecializacao();
    }

    private Unidade unidade;

    private boolean modalidadePresencial;

    private boolean modalidadeSemipresencial;

    private boolean modalidadeOnline;

    private boolean modalidadeEtim;

    private boolean modalidadeEspecializacao;

    public static List<RelacaoCursoDTO> mapForCurso(List<RelacaoUnidadeCurso> unidadeCursos) {
        return unidadeCursos.stream().map(RelacaoCursoDTO::new).toList();
    }
}
