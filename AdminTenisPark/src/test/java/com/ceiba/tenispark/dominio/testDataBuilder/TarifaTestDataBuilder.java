package com.ceiba.tenispark.dominio.testDataBuilder;

import com.ceiba.tenispark.dominio.modelo.Tarifa;

public class TarifaTestDataBuilder {

	private static final Integer COSTO = 1;
	private static final Integer DIA = 1;


	public Tarifa build() {
		return new Tarifa(COSTO, DIA);
	}

}
