package com.ceiba.adminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adminTenisPark.aplicacion.comando.TarifaComando;
import com.ceiba.adminTenisPark.dominio.modelo.Tarifa;

@Component
public class TarifaFabrica {
	
	public Tarifa crear(TarifaComando tarifaComando) {
		return new Tarifa(tarifaComando.getId()
				,tarifaComando.getCosto()
				,tarifaComando.getDia());
	}

}
