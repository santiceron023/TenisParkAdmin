package com.ceiba.tenispark.infraestructura.repositorio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class TarifaEntity {
	
	@Column(name = "costo", nullable = false, length = 10)
	private Integer costo;
	
	@Id
	private Integer dia;

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
