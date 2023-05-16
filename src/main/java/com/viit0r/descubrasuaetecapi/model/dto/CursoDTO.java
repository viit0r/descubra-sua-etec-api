package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.Curso;
import lombok.Data;

import java.util.List;

@Data
public class CursoDTO {

    private CursoDTO(Curso curso, List<RelacaoCursoDTO> cursoUnidades) {
        this.idCurso = curso.getIdCurso();
        this.nome = curso.getNome();
        this.descricao = curso.getDescricao();
        this.cargaHoraria = curso.getCargaHoraria();
        this.duracaoSemestre = curso.getDuracaoSemestre();
        this.eixoTecnologico = curso.getEixoTecnologico();
        this.link = curso.getLink();
        this.preRequisitos = curso.getPreRequisitos();
        this.cursoUnidades = cursoUnidades;
    }

    private Long idCurso;

    private String nome;

    private String descricao;

    private Integer cargaHoraria;

    private Integer duracaoSemestre;

    private String eixoTecnologico;

    private String link;

    private String preRequisitos;

    private List<RelacaoCursoDTO> cursoUnidades;

    public static CursoDTO add(Curso curso, List<RelacaoCursoDTO> cursoUnidades) {
        return new CursoDTO(curso, cursoUnidades);
    }
}
