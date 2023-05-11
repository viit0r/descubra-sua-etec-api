package com.viit0r.descubrasuaetecapi.exception.handler;

import com.viit0r.descubrasuaetecapi.exception.exceptions.NaoEncontradoException;
import com.viit0r.descubrasuaetecapi.model.response.util.ExceptionResponse;
import com.viit0r.descubrasuaetecapi.util.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ExceptionHandlerConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleErroServidor(Exception err) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(Util.CODIGO_ERRO_SERVIDOR, false, err.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NaoEncontradoException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundException(NaoEncontradoException err) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(err.getCdRetorno(), false, err.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
