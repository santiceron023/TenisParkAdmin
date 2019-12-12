package com.ceiba.tenispark.aplicacion.comando.manejador.usuario;

import java.util.List;

import org.springframework.stereotype.Component;
import com.ceiba.tenispark.dominio.modelo.Usuario;
import com.ceiba.tenispark.dominio.servicio.usuario.UsuarioListarServicio;


@Component
public class UsuarioListarManejador {
	
	private final UsuarioListarServicio servicio;

	public UsuarioListarManejador(UsuarioListarServicio servicio) {
		this.servicio = servicio;
	}
	
	public List<Usuario> ejecutar(){
		return servicio.ejecutar();
	}
	
	

}
