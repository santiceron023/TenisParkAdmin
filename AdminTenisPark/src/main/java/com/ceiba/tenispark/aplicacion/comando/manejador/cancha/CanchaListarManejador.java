package com.ceiba.tenispark.aplicacion.comando.manejador.cancha;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.dominio.modelo.Cancha;
import com.ceiba.tenispark.dominio.servicio.cancha.CanchaListarServicio;

@Component
public class CanchaListarManejador {

	private final CanchaListarServicio servicio;

	public CanchaListarManejador(CanchaListarServicio servicio) {
		this.servicio = servicio;
	}

	public List<Cancha> ejecutar() {
		return servicio.ejecutar();
	}

}
