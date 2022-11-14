package com.evaluacion.prueba.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.prueba.IService.usuarioService;
import com.evaluacion.prueba.model.Usuario;

@RestController
@RequestMapping("/usuario/")
public class usuarioController {

	@Autowired
	private usuarioService usuarioService;

	@GetMapping
	private ResponseEntity<List<Usuario>> listarUsuario(){
		return ResponseEntity.ok(usuarioService.listarUsuario());
	}
	
	@PostMapping()
	private ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
		try {
			Usuario usuarioGuardada = usuarioService.guardarUsuario(usuario);
			return ResponseEntity.created(new URI("/usuario"+usuarioGuardada.getNumero_identidad())).body(usuarioGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value="delete/{numero_identidad}")
	private ResponseEntity<Boolean> eliminarUsuario(@PathVariable ("numero_identidad") Long numero_identidad){
		usuarioService.eliminarUsuario(numero_identidad);
		return ResponseEntity.ok(!(usuarioService.usuarioPorId(numero_identidad)!=null));
	}
	
	
}
