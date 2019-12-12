package com.ceiba.tenispark.dominio.modelo;

import java.time.LocalDateTime;

import com.ceiba.tenispark.dominio.util.ValidadorArgumentos;

public class Reserva {

	private Tarifa tarifa;
	private Usuario usuario;
	private Cancha cancha;
	private LocalDateTime fechaInicio;		
	private LocalDateTime fechaFin;	
	private Integer numeroUsuarios;
	
	

	public Reserva() {
	}

	public Reserva(
			Integer tarifaId, Integer usuarioId, Integer canchaId, LocalDateTime fechaInicio,
			LocalDateTime fechaFin, Integer numeroUsuarios) {
		
		ValidadorArgumentos.validarNoVacio(tarifaId);
		ValidadorArgumentos.validarDia(tarifaId);
		ValidadorArgumentos.validarFechas(fechaInicio, fechaFin);
		
		ValidadorArgumentos.validarNoVacio(usuarioId);
		ValidadorArgumentos.validarNoVacio(canchaId);
		
		this.tarifa = new Tarifa();
		this.cancha = new Cancha();
		this.usuario = new Usuario();

		this.tarifa.setDia(tarifaId);
		this.cancha.setId(canchaId);
		this.usuario.setId(usuarioId);

		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numeroUsuarios = numeroUsuarios;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
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
	public Integer getNumeroUsuarios() {
		return numeroUsuarios;
	}
	public void setNumeroUsuarios(Integer numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}


}
