package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")
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
    private int cargaHoraria;

    @Column(name = "duracao_semestre")
    private int duracaoSemestre;

    @Column(name = "eixo_tecnologico")
    private String eixoTecnologico;

    @Column(nullable = false)
    private String link;

    @Column
    private String preRequisitos;
}
