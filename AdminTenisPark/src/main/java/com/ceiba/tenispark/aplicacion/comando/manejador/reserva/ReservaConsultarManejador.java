package com.ceiba.tenispark.aplicacion.comando.manejador.reserva;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.fabrica.ReservaFabrica;
import com.ceiba.tenispark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaConsultarServicio;

@Component
public class ReservaConsultarManejador {

	private final ReservaConsultarServicio consultarServicio;
	private final ReservaFabrica reservaFabrica;

	public ReservaConsultarManejador(ReservaConsultarServicio consultarServicio, ReservaFabrica reservaFabrica) {
		this.reservaFabrica = reservaFabrica;
		this.consultarServicio = consultarServicio;
	}

	public List<Reserva> ejecutar(FiltroReservaComando filtroComnado){
		FiltroReservaDto filtro = reservaFabrica.crear(filtroComnado);
		return consultarServicio.ejecutar(filtro);
	}



}
