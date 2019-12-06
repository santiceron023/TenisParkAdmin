package com.ceiba.adminTenisPark.dominio.servicio.reserva;

import java.util.List;

import com.ceiba.adminTenisPark.dominio.modelo.Reserva;
import com.ceiba.adminTenisPark.dominio.modelo.dto.FiltroReserva;
import com.ceiba.adminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;

public class ReservaConsultarServicio {
	
	private final ReservaRepositorio repositorioReserva;

	public ReservaConsultarServicio(ReservaRepositorio repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}	
	
	public List<Reserva> ejecutar(FiltroReserva filtro){
		return repositorioReserva.listarReservas(filtro);
	}

}
