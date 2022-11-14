package com.evaluacion.prueba.IService;

import java.util.List;

import com.evaluacion.prueba.model.Ciudad;

public interface ciudadService {
	
	public List<Ciudad> listarCiudad();
	
	public Ciudad guardarCiudad(Ciudad ciudad);
	
	public Ciudad ciudadPorId(Long id_ciudad);
	
	public Ciudad actualizarCiudad(Ciudad ciudad);
	
	public void eliminarCiudad(Long id_ciudad);

}
