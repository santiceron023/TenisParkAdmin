package com.ceiba.tenispark.dominio.servicio.reserva;

import java.time.temporal.ChronoUnit;
import java.util.List;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.dominio.util.MESSAGES;

public class ReservaCrearServicio {

	private final ReservaRepositorio repositorioReserva;
	private final ReservaConsultarServicio consultarServicio;

	public ReservaCrearServicio(ReservaRepositorio repositorioReserva,
			ReservaConsultarServicio reservaConsultarServicio) {
		this.consultarServicio = reservaConsultarServicio;
		this.repositorioReserva = repositorioReserva;
	}


	public void ejecutar(Reserva reserva) {
		this.validarExistenciaPrevia(reserva);
		this.validarMaxHoras(reserva);
		this.repositorioReserva.crear(reserva);
	}

	private void validarExistenciaPrevia(Reserva reserva){
		if (this.repositorioReserva.reservaExiste(reserva)) {
			throw new ExcepcionDominio(MESSAGES.RESERVA_DUPLICADA);
		}		
	}

	private void validarMaxHoras(Reserva reservaNueva) {
		FiltroReservaDto resrvaFiltro = new FiltroReservaDto(reservaNueva.getFechaInicio().toLocalDate(),
				reservaNueva.getCancha().getId());
		List<Reserva> reservas = this.consultarServicio.ejecutar(resrvaFiltro);
		long minutes = 0;
		for (Reserva reserva : reservas) {
			minutes += minutesReserved(reserva);
		}
		minutes  += minutesReserved(reservaNueva);
		if(minutes > 120L) {
			throw new ExcepcionDominio(MESSAGES.MAXIMO_NUMERO_ALCANZADO);
		}
	}


	private Long minutesReserved(Reserva reserva) {
		return ChronoUnit.MINUTES.between(
				reserva.getFechaInicio(), reserva.getFechaFin());
	}

}
