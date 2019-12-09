package com.ceiba.tenispark.infraestructura.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.reserva.ReservaConsultarManejador;
import com.ceiba.tenispark.aplicacion.comando.manejador.reserva.ReservaCrearManejador;
import com.ceiba.tenispark.dominio.modelo.Reserva;


@RestController
@RequestMapping(value = "/reserva")
public class ReservaControlador {
	
	private final ReservaCrearManejador manejadorCrearReserva;	
	private final ReservaConsultarManejador manejadorConsultarReserva;	

	

	public ReservaControlador(ReservaCrearManejador manejadorCrearReserva,
			ReservaConsultarManejador manejadorConsultarReserva) {
		this.manejadorCrearReserva = manejadorCrearReserva;
		this.manejadorConsultarReserva = manejadorConsultarReserva;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void registrar(@RequestBody ReservaComando comandoReserva) {
		this.manejadorCrearReserva.ejecutar(comandoReserva);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Reserva> listar(@RequestBody FiltroReservaComando filtroReserva) {
		return this.manejadorConsultarReserva.ejecutar(filtroReserva);
	}
	
	
}
