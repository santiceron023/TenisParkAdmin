package com.ceiba.tenispark.aplicacion.comando;

public class CanchaComando {
	private Integer id;
	private String administrador;
	private String telefono;
	
	public CanchaComando() {
	}

	public CanchaComando(Integer id, String administrador, String telefono) {
		this.id = id;
		this.administrador = administrador;
		this.telefono = telefono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
