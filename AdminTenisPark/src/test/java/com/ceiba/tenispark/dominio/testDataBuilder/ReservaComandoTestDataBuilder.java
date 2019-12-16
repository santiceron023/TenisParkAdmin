package com.ceiba.tenispark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.FiltroReservaComando;

public class ReservaComandoTestDataBuilder {
	
	private static final LocalDateTime FECHA_INICIO = 
			LocalDateTime.of(2019, Month.APRIL, 1, 12,11,10);
	private static final LocalDateTime FECHA_FIN = 
			LocalDateTime.of(2019, Month.APRIL, 1, 14,10,12);
	private static final Integer USUARIO_ID = 1;
	private static final Integer CANCHA_ID = 1;
	private static final Integer NUMERO_USUARIOS = 1;

	
	public ReservaComandoTestDataBuilder() {
	}
	
	public ReservaComando build() {
		return new ReservaComando(FECHA_INICIO, FECHA_FIN, USUARIO_ID, CANCHA_ID, NUMERO_USUARIOS);
	}

	public FiltroReservaComando buildFiltro() {
		return new FiltroReservaComando(FECHA_INICIO.toLocalDate(), CANCHA_ID);
	}
	
	
	public ReservaComando buildBadDates() {
		return new ReservaComando(FECHA_FIN,FECHA_INICIO, USUARIO_ID, CANCHA_ID, NUMERO_USUARIOS);
	}
}
