package com.evaluacion.prueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluacion.prueba.model.Ocupacion;

public interface ocupacionRepository extends JpaRepository<Ocupacion, Long> {

}
