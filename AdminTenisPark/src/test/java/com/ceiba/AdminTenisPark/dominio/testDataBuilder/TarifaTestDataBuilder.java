package com.ceiba.AdminTenisPark.dominio.testDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import com.ceiba.AdminTenisPark.aplicacion.comando.TarifaComando;
import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;

public class TarifaTestDataBuilder {
	
//	private static final LocalDateTime FECHA = 
//			LocalDateTime.of(2019, Month.APRIL, 1, 14, 0);
	private static final Integer TARIFA_ID = 1;
	private static final Integer DIA = 1;
	
	
	public Tarifa build() {
		return new Tarifa(TARIFA_ID, TARIFA_ID, DIA);
	}

}
