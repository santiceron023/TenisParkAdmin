package com.ceiba.AdminTenisPark.dominio.servicio.reserva;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.AdminTenisPark.dominio.util.MESSAGES;

public class ReservaCrearServicio {

	private final ReservaRepositorio repositorioReserva;

	public ReservaCrearServicio(ReservaRepositorio repositorioReserva) {
		this.repositorioReserva = repositorioReserva;
	}
	
	
	public void ejecutar(Reserva reserva) {
		this.validarExistenciaPrevia(reserva);
		this.repositorioReserva.crear(reserva);
	}
	
	private void validarExistenciaPrevia(Reserva reserva){
		if (this.repositorioReserva.reservaExiste(reserva)) {
//			throw new Exception(MESSAGES.RESERVA_DUPLICADA);
			System.out.println(" HOLA" );
		}
		
	}
}
