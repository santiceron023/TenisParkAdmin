package com.ceiba.adminTenisPark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.adminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;
import com.ceiba.adminTenisPark.dominio.servicio.reserva.ReservaCrearServicio;
import com.ceiba.adminTenisPark.dominio.servicio.tarifa.TarifaConsultarServicio;
import com.ceiba.adminTenisPark.dominio.servicio.tarifa.TarifaCrearServicio;

@Configuration
public class TarifaBean {

	@Bean
	public TarifaCrearServicio TarifaCrearBean(TarifaRepositorio repositorioR) {
		return new TarifaCrearServicio(repositorioR);
	}
	
	@Bean
	public TarifaConsultarServicio TarifaConsultarBean(TarifaRepositorio repositorioR) {
		return new TarifaConsultarServicio(repositorioR);
	}



}
