package com.ceiba.tenispark.dominio.modelo;


import com.ceiba.tenispark.dominio.util.ValidadorArgumentos;

public class Tarifa {

	private Integer dia;
	private Integer costo;

	public Tarifa(Integer tarifa, Integer dia) {
		ValidadorArgumentos.validarDia(dia);
		this.dia = dia;
		this.costo = tarifa;
	}
	
	public Tarifa() {
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
