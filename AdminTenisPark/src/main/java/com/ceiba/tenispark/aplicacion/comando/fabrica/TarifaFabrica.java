package com.ceiba.tenispark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.TarifaComando;
import com.ceiba.tenispark.dominio.modelo.Tarifa;

@Component
public class TarifaFabrica {
	
	public Tarifa crear(TarifaComando tarifaComando) {
		return new Tarifa(tarifaComando.getCosto()
				,tarifaComando.getDia());
	}

}
