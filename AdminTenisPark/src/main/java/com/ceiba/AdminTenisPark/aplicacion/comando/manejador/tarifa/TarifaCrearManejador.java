package com.ceiba.AdminTenisPark.aplicacion.comando.manejador.tarifa;

import org.springframework.stereotype.Component;

import com.ceiba.AdminTenisPark.aplicacion.comando.TarifaComando;
import com.ceiba.AdminTenisPark.aplicacion.comando.fabrica.TarifaFabrica;
import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.AdminTenisPark.dominio.servicio.tarifa.TarifaCrearServicio;

@Component
public class TarifaCrearManejador {
	
	private final TarifaCrearServicio tarifaCrearServicio;
	private final TarifaFabrica tarifaFabrica;
	
	public TarifaCrearManejador(TarifaCrearServicio crearServicio, TarifaFabrica tarifaFabrica) {
		this.tarifaCrearServicio = crearServicio;
		this.tarifaFabrica = tarifaFabrica;
	}
	
	public void ejecutar(TarifaComando tarifaComando) {
		Tarifa tarifa = this.tarifaFabrica.crear(tarifaComando);
		this.tarifaCrearServicio.ejecutar(tarifa);		
	}
	
	

}
