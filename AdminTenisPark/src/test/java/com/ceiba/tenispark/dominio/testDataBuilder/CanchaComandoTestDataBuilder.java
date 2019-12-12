package com.ceiba.tenispark.dominio.testDataBuilder;

import com.ceiba.tenispark.aplicacion.comando.CanchaComando;

public class CanchaComandoTestDataBuilder {
	
	private static final Integer ID = 1;
	private static final String ADMINISTRADOR = "Dani Orozco";
	private static final String TELEFONO = "350 698 8510";
	
	public CanchaComando build() {
		return new CanchaComando(ID, ADMINISTRADOR, TELEFONO);
	}

}
