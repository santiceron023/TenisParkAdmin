package com.ceiba.AdminTenisPark.aplicacion.comando;

import java.time.LocalDateTime;

public class ComandoReserva {

	private Integer numeroCancha;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public ComandoReserva(Integer numeroCancha, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		super();
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
