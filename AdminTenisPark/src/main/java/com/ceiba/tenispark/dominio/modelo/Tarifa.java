package com.ceiba.tenispark.dominio.modelo;


import com.ceiba.tenispark.dominio.util.ValidadorArgumentos;

public class Tarifa {

	private Integer dia;
	private Integer costo;

	public Tarifa(Integer costo, Integer dia) {
		ValidadorArgumentos.validarNoVacio(costo);
		ValidadorArgumentos.validarNoVacio(dia);
		ValidadorArgumentos.validarDia(dia);
		this.dia = dia;
		this.costo = costo;
	}
	
	public Tarifa() {
	}
	
	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}

}
