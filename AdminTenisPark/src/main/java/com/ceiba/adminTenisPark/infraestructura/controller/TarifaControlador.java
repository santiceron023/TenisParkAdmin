package com.ceiba.adminTenisPark.infraestructura.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adminTenisPark.aplicacion.comando.TarifaComando;
import com.ceiba.adminTenisPark.aplicacion.comando.manejador.tarifa.TarifaConsultarManejador;
import com.ceiba.adminTenisPark.aplicacion.comando.manejador.tarifa.TarifaCrearManejador;
import com.ceiba.adminTenisPark.dominio.modelo.Tarifa;


@RestController
@RequestMapping(value = "/tarifa")
public class TarifaControlador {
	
	private final TarifaConsultarManejador  consultarManejador;
	private final TarifaCrearManejador  crearManejador;
	
	public TarifaControlador(TarifaConsultarManejador consultarManejador,
			TarifaCrearManejador crearManejador) {
		this.consultarManejador = consultarManejador;
		this.crearManejador = crearManejador;
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void crearTarifa(@RequestBody TarifaComando comandoCliente) {
		this.crearManejador.ejecutar(comandoCliente);
	}
	
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public Tarifa obtenerTarifaPorDia(@RequestParam Integer dia) {
		return this.consultarManejador.ejecutar(dia);
	}
	
}
