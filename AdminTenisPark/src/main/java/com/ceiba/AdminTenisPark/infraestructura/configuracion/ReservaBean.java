package com.ceiba.AdminTenisPark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.AdminTenisPark.dominio.servicio.reserva.ServicioCrearReserva;


@Configuration
public class ReservaBean {
		
		@Bean
		public ServicioCrearReserva servicioCrear(RepositorioReserva repositorioReserva) {
			return new ServicioCrearReserva(repositorioReserva);
		}


}
