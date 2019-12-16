package com.ceiba.tenispark.dominio.modelo.dto;

import java.time.LocalDate;

import com.ceiba.tenispark.dominio.modelo.Reserva;

public class FiltroReservaDto {
	
	private LocalDate dia;
	private Integer cancha;
	
	public FiltroReservaDto(LocalDate dia, Integer cancha) {
		this.dia = dia;
		this.cancha = cancha;
	}
	public FiltroReservaDto(Reserva reserva) {
		this.dia = reserva.getFechaInicio().toLocalDate();
		this.cancha = reserva.getCancha().getId();
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
