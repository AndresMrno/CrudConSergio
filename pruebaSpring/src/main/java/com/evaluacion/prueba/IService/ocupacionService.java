package com.evaluacion.prueba.IService;

import java.util.List;

import com.evaluacion.prueba.model.Ocupacion;

public interface ocupacionService {
	
	public List<Ocupacion> listarOcupacion();
	
	public Ocupacion guardarOcupacion(Ocupacion ocupacion);
	
	public Ocupacion ocupacionPorId(Long id_ocupacion);
	
	public Ocupacion actualizarOcupacion(Ocupacion ocupacion);
	
	public void eliminarOcupacion(Long id_ocupacion);

}
