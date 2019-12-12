package com.ceiba.tenispark.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.tenispark.dominio.puerto.repositorio.UsuarioRepositorio;
import com.ceiba.tenispark.dominio.servicio.usuario.UsuarioListarServicio;

@Configuration
public class UsuarioBean {
	
	@Bean
	public UsuarioListarServicio usuarioListarBean(UsuarioRepositorio repo) {
		return new UsuarioListarServicio(repo);		
	}

}
