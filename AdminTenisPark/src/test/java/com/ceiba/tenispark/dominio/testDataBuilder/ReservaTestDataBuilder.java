package com.ceiba.tenispark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.tenispark.dominio.modelo.Reserva;


public class ReservaTestDataBuilder {

	private static final LocalDateTime FECHA_INICIO = 
			LocalDateTime.of(2019, Month.APRIL, 1, 12, 11, 10);
	private static final LocalDateTime FECHA_FIN = 
			LocalDateTime.of(2019, Month.APRIL, 1, 14, 13, 12);
	private static final Integer TARIFA_ID = 1;
	private static final Integer USUARIO_ID = 1;
	private static final Integer CANCHA_ID = 1;
	private static final Integer NUMERO_USUARIOS = 1;


	public Reserva build() {
		return new Reserva(
				//TODO ELIMINAR
				//				id, 
				TARIFA_ID, USUARIO_ID,
				CANCHA_ID, FECHA_INICIO, FECHA_FIN, NUMERO_USUARIOS);
	}








}
