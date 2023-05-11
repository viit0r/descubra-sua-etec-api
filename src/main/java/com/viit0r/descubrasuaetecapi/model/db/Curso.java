package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "curso")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", nullable = false, unique = true)
    private Long idCurso;

    @Column(nullable = false)
    private String nome;

    @Column
    private String descricao;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @Column(name = "duracao_semestre")
    private Integer duracaoSemestre;

    @Column(name = "eixo_tecnologico")
    private String eixoTecnologico;

    @Column(nullable = false)
    private String link;

    @Column(name = "pre_requisitos")
    private String preRequisitos;
}
