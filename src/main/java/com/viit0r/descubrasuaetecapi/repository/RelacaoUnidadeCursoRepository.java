package com.viit0r.descubrasuaetecapi.repository;

import com.viit0r.descubrasuaetecapi.model.db.Curso;
import com.viit0r.descubrasuaetecapi.model.db.RelacaoUnidadeCurso;
import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelacaoUnidadeCursoRepository extends JpaRepository<RelacaoUnidadeCurso, Long> {
    List<RelacaoUnidadeCurso> findByIdUnidade(Unidade unidade);

    List<RelacaoUnidadeCurso> findByIdCurso(Curso curso);
}
