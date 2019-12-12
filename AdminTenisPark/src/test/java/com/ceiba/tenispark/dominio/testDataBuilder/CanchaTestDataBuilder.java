package com.ceiba.tenispark.dominio.testDataBuilder;

import com.ceiba.tenispark.dominio.modelo.Cancha;

public class CanchaTestDataBuilder {
	
	private static final Integer ID = 1;
	private static final String ADMINISTRADOR = "Dani Orozco";
	private static final String TELEFONO = "350 698 8510";
	
	public Cancha build() {
		return new Cancha(ID, ADMINISTRADOR, TELEFONO);
	}

}
