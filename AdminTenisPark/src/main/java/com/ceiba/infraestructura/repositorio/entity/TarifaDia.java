package com.ceiba.infraestructura.repositorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarifaDia")
public class TarifaDia {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Administrador", nullable = false, length = 100)
	private String administrador;
	
	@Column(name = "Telefono", nullable = false, length = 100)
	private String telefono;

}
