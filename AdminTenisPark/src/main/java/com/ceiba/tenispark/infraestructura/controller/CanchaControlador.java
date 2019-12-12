package com.ceiba.tenispark.infraestructura.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.tenispark.aplicacion.comando.CanchaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.cancha.CanchaCrearManejador;
import com.ceiba.tenispark.aplicacion.comando.manejador.cancha.CanchaListarManejador;
import com.ceiba.tenispark.dominio.modelo.Cancha;


@RestController
@RequestMapping("/cancha")
public class CanchaControlador {
	
	private final CanchaListarManejador listarManejador;
	private final CanchaCrearManejador crearManejador;
	
	public CanchaControlador(CanchaListarManejador listarManejador, CanchaCrearManejador crearManejador) {
		this.listarManejador = listarManejador;
		this.crearManejador = crearManejador;
	}


	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<Cancha> listar() {
		return this.listarManejador.ejecutar();
	}
	
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void crearTarifa(@RequestBody CanchaComando comando) {
		this.crearManejador.ejecutar(comando);
	}

}
