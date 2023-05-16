package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.Curso;
import com.viit0r.descubrasuaetecapi.model.db.RelacaoUnidadeCurso;
import lombok.Data;

import java.util.List;

@Data
public class RelacaoUnidadeDTO {

    public RelacaoUnidadeDTO(RelacaoUnidadeCurso relacaoUnidadeCurso) {
        this.curso = relacaoUnidadeCurso.getIdCurso();
        this.modalidadePresencial = relacaoUnidadeCurso.isModalidadePresencial();
        this.modalidadeSemipresencial = relacaoUnidadeCurso.isModalidadeSemipresencial();
        this.modalidadeOnline = relacaoUnidadeCurso.isModalidadeOnline();
        this.modalidadeEtim = relacaoUnidadeCurso.isModalidadeEtim();
        this.modalidadeEspecializacao = relacaoUnidadeCurso.isModalidadeEspecializacao();
    }

    private Curso curso;

    private boolean modalidadePresencial;

    private boolean modalidadeSemipresencial;

    private boolean modalidadeOnline;

    private boolean modalidadeEtim;

    private boolean modalidadeEspecializacao;

    public static List<RelacaoUnidadeDTO> mapForUnidade(List<RelacaoUnidadeCurso> unidadeCursos) {
        return unidadeCursos.stream().map(RelacaoUnidadeDTO::new).toList();
    }
}
