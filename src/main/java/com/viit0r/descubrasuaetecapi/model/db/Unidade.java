package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;

@Entity
@Table(name="unidade")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidade", nullable = false, unique = true)
    private Long idUnidade;

    @OneToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private UnidadeEndereco idEndereco;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String site;

    @Column(length = 11)
    private String telefone;
}
