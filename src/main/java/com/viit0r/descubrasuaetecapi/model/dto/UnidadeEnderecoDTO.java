package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.UnidadeEndereco;
import lombok.Data;

@Data
public class UnidadeEnderecoDTO {

    public UnidadeEnderecoDTO(UnidadeEndereco unidadeEndereco) {
        this.idEndereco = unidadeEndereco.getIdEndereco();
        this.tipo = unidadeEndereco.getTipo();
        this.logradouro = unidadeEndereco.getLogradouro();
        this.numero = unidadeEndereco.getNumero();
        this.complemento = unidadeEndereco.getComplemento();
        this.bairro = unidadeEndereco.getBairro();
        this.cep = unidadeEndereco.getCep();
        this.estado = unidadeEndereco.getEstado();
        this.uf = unidadeEndereco.getUf();
    }

    private Long idEndereco;

    private int tipo;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cep;

    private String estado;

    private String uf;
}
