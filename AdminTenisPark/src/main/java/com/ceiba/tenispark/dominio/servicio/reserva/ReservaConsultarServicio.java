package com.ceiba.tenispark.dominio.servicio.reserva;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;

public class ReservaConsultarServicio {
	
	private final ReservaRepositorio repositorioReserva;

	public ReservaConsultarServicio(ReservaRepositorio repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}	
	
	public List<Reserva> ejecutar(FiltroReservaDto filtro){
		return repositorioReserva.listarReservas(filtro);
	}

}
