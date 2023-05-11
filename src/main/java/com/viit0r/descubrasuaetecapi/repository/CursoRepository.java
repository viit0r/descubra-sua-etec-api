package com.viit0r.descubrasuaetecapi.repository;

import com.viit0r.descubrasuaetecapi.model.db.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNomeContainingIgnoreCase(String filtro);
}
