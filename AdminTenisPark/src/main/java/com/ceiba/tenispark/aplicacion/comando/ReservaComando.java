package com.ceiba.tenispark.aplicacion.comando;

import java.time.LocalDateTime;

public class ReservaComando {

	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private Integer tarifa;
	private Integer usuario;
	private Integer cancha;
	private Integer numeroUsuarios;

	public ReservaComando() {
	}
	
	public ReservaComando(LocalDateTime fechaInicio, LocalDateTime fechaFin, Integer tarifa,
			Integer usuario, Integer cancha, Integer numeroUsuarios) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tarifa = tarifa;
		this.usuario = usuario;
		this.cancha = cancha;
		this.numeroUsuarios = numeroUsuarios;
	}
	
	public Integer getTarifa() {
		return tarifa;
	}

	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Integer getCancha() {
		return cancha;
	}

	public void setCancha(Integer cancha) {
		this.cancha = cancha;
	}

	public Integer getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public void setNumeroUsuarios(Integer numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
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
