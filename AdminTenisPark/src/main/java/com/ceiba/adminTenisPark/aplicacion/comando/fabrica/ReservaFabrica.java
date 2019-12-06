package com.ceiba.adminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adminTenisPark.aplicacion.comando.ReservaComando;
import com.ceiba.adminTenisPark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.adminTenisPark.dominio.modelo.Reserva;
import com.ceiba.adminTenisPark.dominio.modelo.dto.FiltroReserva;


@Component
public class ReservaFabrica {

	public Reserva crear(ReservaComando comando) {
		return new Reserva(
				//TODO ELIMIANR
//				comando.getId(), 
				comando.getTarifa()
				, comando.getUsuario(), comando.getCancha()
				, comando.getFechaInicio(), comando.getFechaFin()
				, comando.getNumeroUsuarios()
				);
	}

	public FiltroReserva crear(FiltroReservaComando comando) {
		return new FiltroReserva(comando.getDia(),comando.getCancha());
	}

}
