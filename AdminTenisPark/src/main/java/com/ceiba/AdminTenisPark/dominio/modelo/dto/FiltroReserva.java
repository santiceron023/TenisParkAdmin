package com.ceiba.AdminTenisPark.dominio.modelo.dto;

import java.time.LocalDate;

public class FiltroReserva {
	private LocalDate dia;
	private Integer cancha;
	public FiltroReserva(LocalDate dia, Integer cancha) {
		this.dia = dia;
		this.cancha = cancha;
	}
	public FiltroReserva() {
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
