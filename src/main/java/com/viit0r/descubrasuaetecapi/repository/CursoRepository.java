package com.viit0r.descubrasuaetecapi.repository;

import com.viit0r.descubrasuaetecapi.model.db.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
