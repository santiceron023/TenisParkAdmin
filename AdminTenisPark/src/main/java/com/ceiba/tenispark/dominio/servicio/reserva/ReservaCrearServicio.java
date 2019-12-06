package com.ceiba.tenispark.dominio.servicio.reserva;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.dominio.util.MESSAGES;

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
			throw new ExcepcionDominio(MESSAGES.RESERVA_DUPLICADA);
		}		
	}
}
