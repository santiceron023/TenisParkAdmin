package com.ceiba.adminTenisPark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.adminTenisPark.dominio.servicio.reserva.ReservaConsultarServicio;
import com.ceiba.adminTenisPark.dominio.servicio.reserva.ReservaCrearServicio;


@Configuration
public class ReservaBean {

	@Bean
	public ReservaCrearServicio reservaCrearBean(ReservaRepositorio repositorioReserva) {
		return new ReservaCrearServicio(repositorioReserva);
	}
	
	@Bean
	public ReservaConsultarServicio reservaConsultarBean(ReservaRepositorio repositorioReserva) {
		return new ReservaConsultarServicio(repositorioReserva);
	}


}
