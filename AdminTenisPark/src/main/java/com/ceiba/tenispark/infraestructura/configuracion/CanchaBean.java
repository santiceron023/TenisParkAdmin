package com.ceiba.tenispark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.tenispark.dominio.puerto.repositorio.CanchaRepository;
import com.ceiba.tenispark.dominio.servicio.cancha.CanchaCrearServicio;
import com.ceiba.tenispark.dominio.servicio.cancha.CanchaListarServicio;

@Configuration
public class CanchaBean {

	@Bean
	public CanchaListarServicio canchaListarBean(CanchaRepository repo) {
		return new CanchaListarServicio(repo);
	}
	
	@Bean
	public CanchaCrearServicio canchaCrearBean(CanchaRepository repo) {
		return new CanchaCrearServicio(repo);
	}
}
