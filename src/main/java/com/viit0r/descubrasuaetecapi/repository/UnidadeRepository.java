package com.viit0r.descubrasuaetecapi.repository;

import com.viit0r.descubrasuaetecapi.model.db.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
    List<Unidade> findByNomeContainingIgnoreCase(String filtro);
}
