package com.ceiba.AdminTenisPark.aplicacion.comando.manejador.tarifa;

import org.springframework.stereotype.Component;

import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.AdminTenisPark.dominio.servicio.tarifa.TarifaConsultarServicio;

@Component
public class TarifaConsultarManejador {
	
	private final TarifaConsultarServicio tarifaConsultarServicio;
	
	public TarifaConsultarManejador(TarifaConsultarServicio tarifaConsultarServicio) {
		this.tarifaConsultarServicio = tarifaConsultarServicio;
	}

	public Tarifa ejecutar(Integer dia) {
		return this.tarifaConsultarServicio.ejecutar(dia);		
	}

}
