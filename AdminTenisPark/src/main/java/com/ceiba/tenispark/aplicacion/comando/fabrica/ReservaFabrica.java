package com.ceiba.tenispark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;


@Component
public class ReservaFabrica {

	public Reserva crear(ReservaComando comando) {
		return new Reserva(
				comando.getTarifa()
				, comando.getUsuario(), comando.getCancha()
				, comando.getFechaInicio(), comando.getFechaFin()
				, comando.getNumeroUsuarios()
				);
	}

	public FiltroReservaDto crear(FiltroReservaComando comando) {
		return new FiltroReservaDto(comando.getDia(),comando.getCancha());
	}

}
