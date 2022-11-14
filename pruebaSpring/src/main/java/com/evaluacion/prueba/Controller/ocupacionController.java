package com.evaluacion.prueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.prueba.IService.ocupacionService;
import com.evaluacion.prueba.model.Ocupacion;

@RestController
@RequestMapping("/ocupacion")
public class ocupacionController {

	@Autowired
	private ocupacionService ocupacionService;
	
	@GetMapping()
	private ResponseEntity<List<Ocupacion>> listarOcupacion(){
		return ResponseEntity.ok(ocupacionService.listarOcupacion());
	}
	
	
}
