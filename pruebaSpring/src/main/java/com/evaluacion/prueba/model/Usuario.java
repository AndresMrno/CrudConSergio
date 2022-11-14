package com.evaluacion.prueba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="usuarios")

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private Long numero_identidad;
	
	@Column(name="nombre")
	private String nombre;
	
	
	@Column(name="apellido")
	private String apellido;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	
	
	@OneToOne
	@JoinColumn(name="id_ciudad_fk")
	private Ciudad id_ciudad_fk;
	
	@Column(name="correo_electronico")
	private String correo_electronico;
	
	
	@Column(name="telefono")
	private String telefono;
	
	@OneToOne
	@JoinColumn(name="id_ocupacion_fk")
	private Ocupacion id_ocupacion_fk;
	
	public Usuario() {

	}
	
	public Usuario(Long numero_identidad, String nombre, String apellido, Date fecha_nacimiento, Ciudad id_ciudad_fk,
			String correo_electronico, String telefono, Ocupacion id_ocupacion_fk) {
		super();
		this.numero_identidad = numero_identidad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.id_ciudad_fk = id_ciudad_fk;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.id_ocupacion_fk = id_ocupacion_fk;
	}





	public Long getNumero_identidad() {
		return numero_identidad;
	}



	public void setNumero_identidad(Long numero_identidad) {
		this.numero_identidad = numero_identidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public Ciudad getId_ciudad_fk() {
		return id_ciudad_fk;
	}



	public void setId_ciudad_fk(Ciudad id_ciudad_fk) {
		this.id_ciudad_fk = id_ciudad_fk;
	}



	public String getCorreo_electronico() {
		return correo_electronico;
	}



	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Ocupacion getId_ocupacion_fk() {
		return id_ocupacion_fk;
	}



	public void setId_ocupacion_fk(Ocupacion id_ocupacion_fk) {
		this.id_ocupacion_fk = id_ocupacion_fk;
	}
}
