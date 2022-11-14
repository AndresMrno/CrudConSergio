package com.evaluacion.prueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluacion.prueba.model.Ciudad;

public interface ciudadRepository extends JpaRepository<Ciudad, Long> {

}
