package com.ceiba.tenispark.dominio.modelo.dto;

import java.time.LocalDate;

public class FiltroReservaDto {
	
	private LocalDate dia;
	private Integer cancha;
	
	public FiltroReservaDto(LocalDate dia, Integer cancha) {
		this.dia = dia;
		this.cancha = cancha;
	}
	public FiltroReservaDto() {
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	public Integer getCancha() {
		return cancha;
	}
	public void setCancha(Integer cancha) {
		this.cancha = cancha;
	}
	

}
