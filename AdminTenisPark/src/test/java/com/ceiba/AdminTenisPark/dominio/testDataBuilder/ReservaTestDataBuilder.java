package com.ceiba.AdminTenisPark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;


public class ReservaTestDataBuilder {

	private static final Integer NUMERO_CANCHA = 1;
	private static final LocalDateTime FECHA_INICIO = LocalDateTime.of(2019, Month.APRIL, 1, 12, 0);
	private static final LocalDateTime FECHA_FIN = LocalDateTime.of(2019, Month.APRIL, 1, 14, 0);


	private Integer numeroCancha;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public ReservaTestDataBuilder() {
		this.numeroCancha = NUMERO_CANCHA;
		this.fechaInicio = FECHA_INICIO;
		this.fechaFin = FECHA_FIN;
	}
	
	public Reserva build() {
		return new Reserva(this.numeroCancha, this.fechaInicio, this.fechaFin);
	}
	
	public ReservaTestDataBuilder conFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
		return this;
	}
	
	public ReservaTestDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}
	
	public ReservaTestDataBuilder conNumeroDeCancha(Integer numeroCancha) {
		this.numeroCancha = numeroCancha;
		return this;
	}
	
	
	





}
