package com.evaluacion.prueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ocupaciones")

public class Ocupacion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_ocupacion;
	
	@Column(name="nombre_ocupacion")
	public String nombre_ocupacion;
	
	public Ocupacion() {

	}
	public Ocupacion(String nombre_ocupacion) {
		super();
		this.nombre_ocupacion = nombre_ocupacion;
	}
	public Long getId_ocupacion() {
		return id_ocupacion;
	}
	public void setId_ocupacion(Long id_ocupacion) {
		this.id_ocupacion = id_ocupacion;
	}
	public String getNombre_ocupacion() {
		return nombre_ocupacion;
	}
	public void setNombre_ocupacion(String nombre_ocupacion) {
		this.nombre_ocupacion = nombre_ocupacion;
	}
}
