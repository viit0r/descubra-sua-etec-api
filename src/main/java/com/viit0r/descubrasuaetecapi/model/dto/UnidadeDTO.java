package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import lombok.Data;

@Data
public class UnidadeDTO {

    public UnidadeDTO(Unidade unidade) {
        this.idUnidade = unidade.getIdUnidade();
        this.nome = unidade.getNome();
        this.descricao = unidade.getDescricao();
        this.telefone = unidade.getTelefone();
        this.site = unidade.getSite();
        this.email = unidade.getEmail();
        this.unidadeEndereco = new UnidadeEnderecoDTO(unidade.getIdEndereco());
    }

    private Long idUnidade;

    private String nome;

    private String descricao;

    private String telefone;

    private String site;

    private String email;

    private UnidadeEnderecoDTO unidadeEndereco;
}
