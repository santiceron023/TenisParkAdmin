package com.ceiba.AdminTenisPark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.adminTenisPark.aplicacion.comando.ReservaComando;

public class ReservaComandoTestDataBuilder {
	
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
	
	public ReservaComandoTestDataBuilder() {
		this.numeroCancha = CANCHA_ID;
		this.fechaInicio = FECHA_INICIO;
		this.fechaFin = FECHA_FIN;
	}
	
	public ReservaComando build() {
		return new ReservaComando(FECHA_INICIO, FECHA_FIN, TARIFA_ID, USUARIO_ID, CANCHA_ID, NUMERO_USUARIOS);
	}
	
	public ReservaComandoTestDataBuilder conFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
		return this;
	}
	
	public ReservaComandoTestDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}
	
	public ReservaComandoTestDataBuilder conNumeroDeCancha(Integer numeroCancha) {
		this.numeroCancha = numeroCancha;
		return this;
	}
}
