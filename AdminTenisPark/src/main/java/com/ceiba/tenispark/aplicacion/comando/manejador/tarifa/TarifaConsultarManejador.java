package com.ceiba.tenispark.aplicacion.comando.manejador.tarifa;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.servicio.tarifa.TarifaConsultarServicio;

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
