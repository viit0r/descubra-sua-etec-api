package com.viit0r.descubrasuaetecapi.exception.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(String message, String cdRetorno) {
        super(message);
        this.cdRetorno = cdRetorno;
    }

    private final String cdRetorno;

}
