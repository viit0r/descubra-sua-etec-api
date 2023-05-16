package com.viit0r.descubrasuaetecapi.model.dto;

import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import lombok.Data;

import java.util.List;

@Data
public class UnidadeDTO {

    private UnidadeDTO(Unidade unidade, List<RelacaoUnidadeDTO> unidadeCursos) {
        this.idUnidade = unidade.getIdUnidade();
        this.nome = unidade.getNome();
        this.descricao = unidade.getDescricao();
        this.telefone = unidade.getTelefone();
        this.site = unidade.getSite();
        this.email = unidade.getEmail();
        this.unidadeEndereco = new UnidadeEnderecoDTO(unidade.getIdEndereco());
        this.unidadeCursos = unidadeCursos;
    }

    private Long idUnidade;

    private String nome;

    private String descricao;

    private String telefone;

    private String site;

    private String email;

    private UnidadeEnderecoDTO unidadeEndereco;

    private List<RelacaoUnidadeDTO> unidadeCursos;

    public static UnidadeDTO add(Unidade unidade, List<RelacaoUnidadeDTO> unidadeCursos) {
        return new UnidadeDTO(unidade, unidadeCursos);
    }
}
