package com.ceiba.AdminTenisPark.dominio.servicio.reserva;

import java.util.List;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.modelo.dto.FiltroReserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;

public class ReservaConsultarServicio {
	
	private final ReservaRepositorio repositorioReserva;

	public ReservaConsultarServicio(ReservaRepositorio repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}	
	
	public List<Reserva> ejecutar(FiltroReserva filtro){
		return repositorioReserva.listarReservas(filtro);
	}

}
