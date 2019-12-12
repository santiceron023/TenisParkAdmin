package com.ceiba.tenispark.infraestructura.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ceiba.tenispark.aplicacion.comando.manejador.usuario.UsuarioListarManejador;
import com.ceiba.tenispark.dominio.modelo.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	private final UsuarioListarManejador listarManejador;
	
	public UsuarioControlador(UsuarioListarManejador listarManejador) {
		this.listarManejador = listarManejador;
	}

	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<Usuario> obtenerTarifaPorDia() {
		return this.listarManejador.ejecutar();
	}

}
