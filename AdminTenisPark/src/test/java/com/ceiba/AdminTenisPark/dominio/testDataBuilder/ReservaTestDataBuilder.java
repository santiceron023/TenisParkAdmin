package com.ceiba.AdminTenisPark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.adminTenisPark.dominio.modelo.Reserva;


public class ReservaTestDataBuilder {

	private static final LocalDateTime FECHA_INICIO = 
			LocalDateTime.of(2019, Month.APRIL, 1, 12, 0);
	private static final LocalDateTime FECHA_FIN = 
			LocalDateTime.of(2019, Month.APRIL, 1, 14, 0);
	private static final Integer TARIFA_ID = 1;
	private static final Integer USUARIO_ID = 1;
	private static final Integer CANCHA_ID = 1;
	private static final Integer NUMERO_USUARIOS = 1;


	private Integer numeroCancha;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;

	public Reserva build() {
		return new Reserva(
				//TODO ELIMINAR
				//				id, 
				TARIFA_ID, USUARIO_ID,
				CANCHA_ID, FECHA_INICIO, FECHA_FIN, NUMERO_USUARIOS);
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
