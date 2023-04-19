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

    private String descricao;

    @Column(name = "eixo_tecnologico")
    private String eixoTecnologico;

    @Column(name = "mercado_trabalho")
    private String mercadoTrabalho;

    @Column(nullable = false)
    private String link;
}
