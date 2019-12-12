package com.ceiba.tenispark.aplicacion.comando;

public class CanchaComando {
	private String administrador;
	private String telefono;
	private Integer id;

	public CanchaComando() {
	}

	public CanchaComando(Integer id, String administrador, String telefono) {
		this.telefono = telefono;
		this.administrador = administrador;
		this.id = id;
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

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}





}
