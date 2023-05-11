package com.viit0r.descubrasuaetecapi.model.response.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class ExceptionResponse extends MessageResponse implements Serializable {
    public ExceptionResponse(String cdRetorno, boolean sucesso, String descricao) {
        super(cdRetorno, sucesso);
        this.descricao = descricao;
    }

    private String descricao;
}
