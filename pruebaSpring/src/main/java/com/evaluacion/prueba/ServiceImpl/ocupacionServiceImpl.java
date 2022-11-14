package com.evaluacion.prueba.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.prueba.IService.ocupacionService;
import com.evaluacion.prueba.Repository.ocupacionRepository;
import com.evaluacion.prueba.model.Ocupacion;

@Service
public class ocupacionServiceImpl implements ocupacionService {
	
	@Autowired
	private ocupacionRepository ocupacionRepor;

	@Override
	public List<Ocupacion> listarOcupacion() {
		return ocupacionRepor.findAll();
	}

	@Override
	public Ocupacion guardarOcupacion(Ocupacion ocupacion) {
		return ocupacionRepor.save(ocupacion);
	}

	@Override
	public Ocupacion ocupacionPorId(Long id_ocupacion) {
		return ocupacionRepor.findById(id_ocupacion).get();
	}

	@Override
	public Ocupacion actualizarOcupacion(Ocupacion ocupacion) {
		return ocupacionRepor.save(ocupacion);
	}

	@Override
	public void eliminarOcupacion(Long id_ocupacion) {
		ocupacionRepor.deleteById(id_ocupacion);
		
	}
	
	
	

}
