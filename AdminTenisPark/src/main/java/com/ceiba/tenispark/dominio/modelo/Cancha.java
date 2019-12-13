package com.ceiba.tenispark.dominio.modelo;

import com.ceiba.tenispark.dominio.util.ValidadorArgumentos;

public class Cancha {

	private Integer id;
	private String administrador;
	private String telefono;
	public Cancha(Integer id, String administrador, String telefono) {
		ValidadorArgumentos.validarNoVacio(telefono);
		ValidadorArgumentos.validarNoVacio(id);
		ValidadorArgumentos.validarNoVacio(administrador);
		this.id = id;
		this.telefono = telefono;
		this.administrador = administrador;
	}
	public Cancha() {
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getAdministrador() {
		return administrador;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	public Integer getId() {
		return id;
	}

}
