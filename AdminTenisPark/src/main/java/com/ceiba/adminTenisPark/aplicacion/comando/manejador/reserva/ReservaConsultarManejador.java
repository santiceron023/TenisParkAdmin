package com.ceiba.adminTenisPark.aplicacion.comando.manejador.reserva;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adminTenisPark.aplicacion.comando.fabrica.ReservaFabrica;
import com.ceiba.adminTenisPark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.adminTenisPark.dominio.modelo.Reserva;
import com.ceiba.adminTenisPark.dominio.modelo.dto.FiltroReserva;
import com.ceiba.adminTenisPark.dominio.servicio.reserva.ReservaConsultarServicio;

@Component
public class ReservaConsultarManejador {

	private final ReservaConsultarServicio consultarServicio;
	private final ReservaFabrica reservaFabrica;

	public ReservaConsultarManejador(ReservaConsultarServicio consultarServicio, ReservaFabrica reservaFabrica) {
		this.reservaFabrica = reservaFabrica;
		this.consultarServicio = consultarServicio;
	}

	public List<Reserva> ejecutar(FiltroReservaComando filtroComnado){
		FiltroReserva filtro = reservaFabrica.crear(filtroComnado);
		return consultarServicio.ejecutar(filtro);
	}



}
