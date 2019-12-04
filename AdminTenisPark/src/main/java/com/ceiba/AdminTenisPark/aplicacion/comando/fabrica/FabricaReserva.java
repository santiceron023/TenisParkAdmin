package com.ceiba.AdminTenisPark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;
import com.ceiba.AdminTenisPark.aplicacion.comando.ComandoReserva;
import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;


@Component
public class FabricaReserva {
	
    public Reserva crear(ComandoReserva comandoReserva) {
	        return new Reserva(
	        		comandoReserva.getNumeroCancha(),
	        		comandoReserva.getFechaInicio(), 
	        		comandoReserva.getFechaFin()
	        		);
	    }

}
