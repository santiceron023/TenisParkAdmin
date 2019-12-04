package com.ceiba.AdminTenisPark.dominio.servicio.reserva;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioCrearReserva {

	private RepositorioReserva repositorioReserva;	

	public ServicioCrearReserva(RepositorioReserva repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	public void ejecutar(Reserva reserva) {
		// this.validarExistenciaPrevia(reserva.get);
		this.repositorioReserva.crear(reserva);
	}
	private void validarExistenciaPrevia(String reservaId){}
}
