package com.ceiba.tenispark.infraestructura.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.reserva.ReservaCrearManejador;


@RestController
@RequestMapping(value = "/reserva")
public class ReservaControlador {
	
	private final ReservaCrearManejador manejadorCrearReserva;	

	public ReservaControlador(ReservaCrearManejador manejadorCrearReserva) {
		this.manejadorCrearReserva = manejadorCrearReserva;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void registrar(@RequestBody ReservaComando comandoReserva) {
		this.manejadorCrearReserva.ejecutar(comandoReserva);
	}
}
