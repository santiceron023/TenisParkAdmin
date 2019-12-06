package com.ceiba.adminTenisPark.aplicacion.comando.manejador;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class FiltroReservaComando {
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate dia;
	private Integer cancha;
	
	
	public FiltroReservaComando(LocalDate dia, Integer cancha) {
		this.dia = dia;
		this.cancha = cancha;
	}
	public FiltroReservaComando() {
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
