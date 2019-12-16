package com.ceiba.tenispark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaConsultarServicio;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaCrearServicio;


@Configuration
public class ReservaBean {

	@Bean
	public ReservaCrearServicio reservaCrearBean(ReservaRepositorio repositorioReserva,ReservaConsultarServicio consultarServicio) {
		return new ReservaCrearServicio(repositorioReserva,consultarServicio);
	}
	
	@Bean
	public ReservaConsultarServicio reservaConsultarBean(ReservaRepositorio repositorioReserva) {
		return new ReservaConsultarServicio(repositorioReserva);
	}


}
