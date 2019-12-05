package com.ceiba.AdminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.AdminTenisPark.aplicacion.comando.TarifaComando;
import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;

@Component
public class TarifaFabrica {
	
	public Tarifa crear(TarifaComando tarifaComando) {
		return new Tarifa(tarifaComando.getId()
				,tarifaComando.getCosto()
				,tarifaComando.getDia());
	}

}
