package com.ceiba.AdminTenisPark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.AdminTenisPark.aplicacion.comando.ReservaComando;

public class ComandoReservaDataBuilder {
	
	private static final Integer NUMERO_CANCHA = 1;
	private static final LocalDateTime FECHA_INICIO = LocalDateTime.of(2019, Month.APRIL, 1, 12, 0);
	private static final LocalDateTime FECHA_FIN = LocalDateTime.of(2019, Month.APRIL, 1, 14, 0);
	

	private Integer numeroCancha;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public ComandoReservaDataBuilder() {
		this.numeroCancha = NUMERO_CANCHA;
		this.fechaInicio = FECHA_INICIO;
		this.fechaFin = FECHA_FIN;
	}
	
	public ReservaComando build() {
		return new ReservaComando(this.numeroCancha, this.fechaInicio, this.fechaFin);
	}
	
	public ComandoReservaDataBuilder conFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
		return this;
	}
	
	public ComandoReservaDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}
	
	public ComandoReservaDataBuilder conNumeroDeCancha(Integer numeroCancha) {
		this.numeroCancha = numeroCancha;
		return this;
	}
}
