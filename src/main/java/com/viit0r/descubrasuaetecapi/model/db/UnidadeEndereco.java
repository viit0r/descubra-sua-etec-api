package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "unidade_endereco")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnidadeEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco", nullable = false, unique = true)
    private Long idEndereco;

    @Column(nullable = false, length = 2)
    private int tipo;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false, length = 10)
    private String numero;

    @Column(length = 50)
    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false, length = 9)
    private String cep;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false, length = 2)
    private String uf;
}
