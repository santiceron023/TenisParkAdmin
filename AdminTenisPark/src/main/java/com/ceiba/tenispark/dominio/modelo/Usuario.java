package com.ceiba.tenispark.dominio.modelo;

public class Usuario {

	private Integer identificacion;
	private Integer id;
	private String telefono;
	private String nombre;

	public Usuario(Integer id, String nombre, String telefono, Integer identificacion) {
		this.nombre = nombre;
		this.id = id;
		this.identificacion = identificacion;
		this.telefono = telefono;
	}

	public Usuario() {
	}
	public String getNombre() {
		return nombre;
	}

	public Integer getId() {
		return id;
	}
	public String getTelefono() {
		return telefono;
	}
	public Integer getIdentificacion() {
		return identificacion;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}	



}
