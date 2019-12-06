package com.ceiba.tenispark.aplicacion.comando.manejador.reserva;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.fabrica.ReservaFabrica;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaCrearServicio;

@Component
public class ReservaCrearManejador {
	
	private final ReservaCrearServicio servicioCrearReserva;
    private final ReservaFabrica fabricaReserva;
    
	public ReservaCrearManejador(ReservaCrearServicio servicioCrearReserva, ReservaFabrica fabricaReserva) {
		this.servicioCrearReserva = servicioCrearReserva;
		this.fabricaReserva = fabricaReserva;
	}
	
//	@Transactional
	public void ejecutar(ReservaComando comandoReserva) {
        Reserva factura = this.fabricaReserva.crear(comandoReserva);
        this.servicioCrearReserva.ejecutar(factura);
    }    
    

}
