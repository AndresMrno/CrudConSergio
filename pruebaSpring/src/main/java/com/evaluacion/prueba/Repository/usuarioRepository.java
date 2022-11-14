package com.evaluacion.prueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluacion.prueba.model.Usuario;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {

}
