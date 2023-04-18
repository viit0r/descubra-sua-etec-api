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

    private String tipo;

    @Column(nullable = false)
    private String link;
}
