package com.ceiba.AdminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;
import com.ceiba.AdminTenisPark.aplicacion.comando.ReservaComando;
import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;


@Component
public class ReservaFabrica {
	
    public Reserva crear(ReservaComando comandoReserva) {
	        return new Reserva(
	        		comandoReserva.getNumeroCancha(),
	        		comandoReserva.getFechaInicio(), 
	        		comandoReserva.getFechaFin()
	        		);
	    }

}
