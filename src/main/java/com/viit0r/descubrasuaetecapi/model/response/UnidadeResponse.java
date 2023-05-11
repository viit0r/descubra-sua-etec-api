package com.viit0r.descubrasuaetecapi.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.viit0r.descubrasuaetecapi.model.dto.UnidadeDTO;
import com.viit0r.descubrasuaetecapi.model.response.util.MessageResponse;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UnidadeResponse extends MessageResponse implements Serializable {

    public UnidadeResponse(List<UnidadeDTO> unidades, String cdRetorno, boolean sucesso) {
        super(cdRetorno, sucesso);
        this.unidades = unidades;
    }

    public UnidadeResponse(UnidadeDTO unidade, String cdRetorno, boolean sucesso) {
        super(cdRetorno, sucesso);
        this.unidade = unidade;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<UnidadeDTO> unidades;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UnidadeDTO unidade;
}
