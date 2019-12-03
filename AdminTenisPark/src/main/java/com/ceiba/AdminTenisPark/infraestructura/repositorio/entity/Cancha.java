package com.ceiba.AdminTenisPark.infraestructura.repositorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cancha")
public class Cancha {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "Administrador", nullable = false, length = 100)
	private String administrador;
	
	@Column(name = "Telefono", nullable = false, length = 20)
	private String telefono;

	public Cancha(Long codigo, String administrador, String telefono) {
		super();
		this.codigo = codigo;
		this.administrador = administrador;
		this.telefono = telefono;
	}

	public Cancha() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
