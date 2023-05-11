package com.viit0r.descubrasuaetecapi.controller;

import com.viit0r.descubrasuaetecapi.model.response.curso.CursoResponse;
import com.viit0r.descubrasuaetecapi.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
