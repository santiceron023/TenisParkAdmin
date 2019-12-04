package com.ceiba.AdminTenisPark.infraestructura.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ceiba.AdminTenisPark.aplicacion.comando.ComandoReserva;
import com.medicaApp.model.Paciente;

@RestController
@RequestMapping(value = "/reserva")
public class ControladorReserva {

//	@PostMapping
//	public ResponseEntity<?> registrar(@RequestBody Paciente pac) {
//
//		Paciente pacSaved = servicio.registrar(pac);
//		//@RequestMapping("/pacientes")
//		URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().
//				//devuelve id
//				path("/{id}").buildAndExpand(pacSaved.getIdPaciente()).toUri();
//
//		return ResponseEntity.created(uriLocation).build();
//	}
}
