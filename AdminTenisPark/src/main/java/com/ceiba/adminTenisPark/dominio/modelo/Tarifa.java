package com.ceiba.adminTenisPark.dominio.modelo;

public class Tarifa {

	private Integer id;
	private Integer costo;
	private Integer dia;
	
	

	public Tarifa() {
	}

	public Tarifa(Integer id, Integer tarifa, Integer dia) {
		//Todo VALIDACIONES
		this.id = id;
		this.costo = tarifa;
		this.dia = dia;
	}

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
