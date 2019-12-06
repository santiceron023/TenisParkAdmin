package com.ceiba.tenispark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ceiba.tenispark.dominio.puerto.repositorio.TarifaRepositorio;
import com.ceiba.tenispark.dominio.servicio.tarifa.TarifaConsultarServicio;
import com.ceiba.tenispark.dominio.servicio.tarifa.TarifaCrearServicio;

@Configuration
public class TarifaBean {

	@Bean
	public TarifaCrearServicio tarifaCrearBean(TarifaRepositorio repositorioR) {
		return new TarifaCrearServicio(repositorioR);
	}
	
	@Bean
	public TarifaConsultarServicio tarifaConsultarBean(TarifaRepositorio repositorioR) {
		return new TarifaConsultarServicio(repositorioR);
	}



}
