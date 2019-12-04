package com.ceiba.AdminTenisPark.dominio.modelo;

import java.time.LocalDateTime;

public class Reserva {

	private Integer numeroCancha;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public Reserva(Integer numeroCancha, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		//VALIDACIONES
		this.numeroCancha = numeroCancha;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public Integer getNumeroCancha() {
		return numeroCancha;
	}
	public void setNumeroCancha(Integer numeroCancha) {
		this.numeroCancha = numeroCancha;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
}
