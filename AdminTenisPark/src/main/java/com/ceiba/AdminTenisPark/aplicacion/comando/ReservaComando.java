package com.ceiba.AdminTenisPark.aplicacion.comando;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class ReservaComando {

	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaInicio;
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaFin;
	private Integer id;
	private Integer tarifa;
	private Integer usuario;
	private Integer cancha;
	private Integer numeroUsuarios;



	public ReservaComando() {
	}
	
	public ReservaComando(LocalDateTime fechaInicio, LocalDateTime fechaFin, Integer id, Integer tarifa,
			Integer usuario, Integer cancha, Integer numeroUsuarios) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.id = id;
		this.tarifa = tarifa;
		this.usuario = usuario;
		this.cancha = cancha;
		this.numeroUsuarios = numeroUsuarios;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
