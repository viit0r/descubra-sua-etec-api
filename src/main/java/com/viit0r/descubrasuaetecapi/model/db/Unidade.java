package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="unidade")
@AllArgsConstructor
@NoArgsConstructor
@Data
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

    @Column(length = 800)
    private String descricao;

    @Column(length = 30)
    private String telefone;

    @Column(nullable = false)
    private String site;

    @Column(length = 25)
    private String email;
}
