package com.viit0r.descubrasuaetecapi.controller;

import com.viit0r.descubrasuaetecapi.model.request.FiltroRequest;
import com.viit0r.descubrasuaetecapi.model.response.curso.CursoResponse;
import com.viit0r.descubrasuaetecapi.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public CursoResponse getAllCursos() {
        return cursoService.getAllCursos();
    }

    @GetMapping("/{idCurso}")
    public CursoResponse getCurso(@PathVariable Long idCurso) {
        return cursoService.getCurso(idCurso);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CursoResponse getCursosByFiltro(@RequestBody FiltroRequest cursoFiltro) {
        return cursoService.getCursosByFiltro(cursoFiltro);
    }
}
