package com.ceiba.tenispark.dominio.modelo;

public class Usuario {
	
	private Integer id;
	private String nombre;
	private String telefono;
	private Integer identificacion;
	
	public Usuario(Integer id, String nombre, String telefono, Integer identificacion) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.identificacion = identificacion;
	}

	public Usuario() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}	
	
	
	
}
