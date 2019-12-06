package com.ceiba.adminTenisPark.infraestructura.repositorio.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class TarifaEntity {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "costo", nullable = false, length = 10)
	private Integer costo;
	
//	@Column(name = "fechaActualizado", nullable = false)
//	private LocalDateTime fechaActualizado;
	
	@Column(name = "dia", nullable = false, length = 1)
	private Integer dia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTarifa() {
		return costo;
	}

	public void setTarifa(Integer tarifa) {
		this.costo = tarifa;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	
}
