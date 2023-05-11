package com.viit0r.descubrasuaetecapi.controller;

import com.viit0r.descubrasuaetecapi.model.request.FiltroRequest;
import com.viit0r.descubrasuaetecapi.model.response.UnidadeResponse;
import com.viit0r.descubrasuaetecapi.service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/unidade")
public class UnidadeController {

    @Autowired
    private UnidadeService unidadeService;

    @GetMapping
    public UnidadeResponse getAllUnidades() {
        return unidadeService.getAllUnidades();
    }

    @GetMapping("/{idUnidade}")
    public UnidadeResponse getUnidade(@PathVariable Long idUnidade) {
        return unidadeService.getUnidade(idUnidade);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UnidadeResponse getUnidadesByFiltro(@RequestBody FiltroRequest filtroRequest) {
        return unidadeService.getUnidadesByFiltro(filtroRequest);
    }
}
