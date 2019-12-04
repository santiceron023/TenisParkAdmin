package com.ceiba.AdminTenisPark.aplicacion.comando.manejador.reserva;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.ceiba.AdminTenisPark.aplicacion.comando.ComandoReserva;
import com.ceiba.AdminTenisPark.aplicacion.comando.fabrica.FabricaReserva;
import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.servicio.reserva.ServicioCrearReserva;


@Component
public class ManejadorCrearReserva {
	
	private final ServicioCrearReserva servicioCrearReserva;
    private final FabricaReserva fabricaReserva;
    
	public ManejadorCrearReserva(ServicioCrearReserva servicioCrearReserva, FabricaReserva fabricaReserva) {
		this.servicioCrearReserva = servicioCrearReserva;
		this.fabricaReserva = fabricaReserva;
	}
	
	@Transactional
	public void ejecutar(ComandoReserva comandoReserva) {
        Reserva factura = this.fabricaReserva.crear(comandoReserva);
        this.servicioCrearReserva.ejecutar(factura);
    }    
    

}
