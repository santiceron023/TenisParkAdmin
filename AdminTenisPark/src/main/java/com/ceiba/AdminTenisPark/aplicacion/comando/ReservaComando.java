package com.ceiba.AdminTenisPark.aplicacion.comando;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class ReservaComando {

	private Integer numeroCancha;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaInicio;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaFin;
	
	
	
	public ReservaComando() {
		super();
	}

	public ReservaComando(Integer numeroCancha, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
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
