package com.evaluacion.prueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.prueba.IService.ciudadService;
import com.evaluacion.prueba.model.Ciudad;

@RestController
@RequestMapping("/ciudad")
public class ciudadController {

	@Autowired
	private ciudadService ciudadService;
	
	@GetMapping()
	private ResponseEntity<List<Ciudad>> listarCiudad(){
		return ResponseEntity.ok(ciudadService.listarCiudad());
	}
	
}
