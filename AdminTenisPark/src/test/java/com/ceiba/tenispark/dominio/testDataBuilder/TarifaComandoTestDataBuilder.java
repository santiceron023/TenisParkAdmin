package com.ceiba.tenispark.dominio.testDataBuilder;

import com.ceiba.tenispark.aplicacion.comando.TarifaComando;

public class TarifaComandoTestDataBuilder {

	private static final Integer COSTO = 2000;
	private static final Integer DIA_OK = 1;
	private static final Integer DIA_BAD = 47;


	public TarifaComando build() {
		return new TarifaComando(COSTO, DIA_OK);
	}
	
	public TarifaComando buildErrorDia() {
		return new TarifaComando(COSTO, DIA_BAD);
	}
	
	

}
