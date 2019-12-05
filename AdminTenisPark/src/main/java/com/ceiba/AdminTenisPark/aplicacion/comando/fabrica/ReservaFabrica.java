package com.ceiba.AdminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;
import com.ceiba.AdminTenisPark.aplicacion.comando.ReservaComando;
import com.ceiba.AdminTenisPark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.modelo.dto.FiltroReserva;


@Component
public class ReservaFabrica {

	public Reserva crear(ReservaComando comando) {
		return new Reserva(comando.getId(), comando.getTarifa()
				, comando.getUsuario(), comando.getCancha()
				, comando.getFechaInicio(), comando.getFechaFin()
				, comando.getNumeroUsuarios()
				);
	}

	public FiltroReserva crear(FiltroReservaComando comando) {
		return new FiltroReserva(comando.getDia(),comando.getCancha());
	}

}
