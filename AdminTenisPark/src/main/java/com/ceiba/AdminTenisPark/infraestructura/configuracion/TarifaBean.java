package com.ceiba.AdminTenisPark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;
import com.ceiba.AdminTenisPark.dominio.servicio.reserva.ReservaCrearServicio;
import com.ceiba.AdminTenisPark.dominio.servicio.tarifa.TarifaConsultarServicio;
import com.ceiba.AdminTenisPark.dominio.servicio.tarifa.TarifaCrearServicio;

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
