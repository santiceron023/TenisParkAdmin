package com.ceiba.tenispark.aplicacion.comando.manejador.tarifa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.servicio.tarifa.TarifaListartarServicio;

@Component
public class TarifaListarManejador {
	
	private final TarifaListartarServicio tarifaListarServicio;
	
	public TarifaListarManejador(TarifaListartarServicio tarifaConsultarServicio) {
		this.tarifaListarServicio = tarifaConsultarServicio;
	}

	public List<Tarifa> ejecutar() {
		return this.tarifaListarServicio.ejecutar();		
	}

}
