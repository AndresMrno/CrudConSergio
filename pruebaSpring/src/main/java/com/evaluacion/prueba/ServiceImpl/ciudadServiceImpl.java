package com.evaluacion.prueba.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.prueba.IService.ciudadService;
import com.evaluacion.prueba.Repository.ciudadRepository;
import com.evaluacion.prueba.model.Ciudad;

@Service
public class ciudadServiceImpl implements ciudadService {
	
	@Autowired
	private ciudadRepository ciudadRepor;

	@Override
	public List<Ciudad> listarCiudad() {
		return ciudadRepor.findAll();
	}

	@Override
	public Ciudad guardarCiudad(Ciudad ciudad) {
		return ciudadRepor.save(ciudad);
	}

	@Override
	public Ciudad ciudadPorId(Long id_ciudad) {
		return ciudadRepor.findById(id_ciudad).get();
	}

	@Override
	public Ciudad actualizarCiudad(Ciudad ciudad) {
		return ciudadRepor.save(ciudad);
	}

	@Override
	public void eliminarCiudad(Long id_ciudad) {
		ciudadRepor.deleteById(id_ciudad);
		
	}
	
	

}
