package com.ceiba.AdminTenisPark.dominio.servicio.reserva;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;

public class ReservaCrearServicio {

	private ReservaRepositorio repositorioReserva;	

	public ReservaCrearServicio(ReservaRepositorio repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	public void ejecutar(Reserva reserva) {
		// this.validarExistenciaPrevia(reserva.get);
		this.repositorioReserva.crear(reserva);
	}
	private void validarExistenciaPrevia(String reservaId){}
}
