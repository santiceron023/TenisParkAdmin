package com.ceiba.AdminTenisPark.infraestructura.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ceiba.AdminTenisPark.aplicacion.comando.ReservaComando;
import com.ceiba.AdminTenisPark.aplicacion.comando.manejador.reserva.ReservaCrearManejador;


@RestController
@RequestMapping(value = "/reserva")
public class ReservaControlador {
	
	private ReservaCrearManejador manejadorCrearReserva;
	
	

	public ReservaControlador(ReservaCrearManejador manejadorCrearReserva) {
		this.manejadorCrearReserva = manejadorCrearReserva;
	}


	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void registrar(@RequestBody ReservaComando comandoReserva) {

//		Paciente pacSaved = servicio.registrar(pac);
//		//@RequestMapping("/pacientes")
//		URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().
//				//devuelve id
//				path("/{id}").buildAndExpand(pacSaved.getIdPaciente()).toUri();
//
//		return ResponseEntity.created(uriLocation).build();
		
		this.manejadorCrearReserva.ejecutar(comandoReserva);

	}
}
