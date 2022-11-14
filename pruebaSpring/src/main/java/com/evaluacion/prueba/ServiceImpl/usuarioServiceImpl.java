package com.evaluacion.prueba.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.prueba.IService.usuarioService;
import com.evaluacion.prueba.Repository.usuarioRepository;
import com.evaluacion.prueba.model.Usuario;

@Service
public class usuarioServiceImpl implements usuarioService {
	
	@Autowired
	private usuarioRepository usuarioRepor;

	@Override
	public List<Usuario> listarUsuario() {
		return usuarioRepor.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepor.save(usuario);
	}

	@Override
	public Usuario usuarioPorId(Long numero_identidad) {
		return usuarioRepor.findById(numero_identidad).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return usuarioRepor.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long numero_identidad) {
		usuarioRepor.deleteById(numero_identidad);
		
	}
	
	
	
}
