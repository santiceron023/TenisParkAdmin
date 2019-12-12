package com.ceiba.tenispark.infraestructura.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.tenispark.aplicacion.comando.TarifaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.tarifa.TarifaListarManejador;
import com.ceiba.tenispark.aplicacion.comando.manejador.tarifa.TarifaCrearManejador;
import com.ceiba.tenispark.dominio.modelo.Tarifa;


@RestController
@RequestMapping(value = "/tarifa")
public class TarifaControlador {
	
	private final TarifaListarManejador  consultarManejador;
	private final TarifaCrearManejador  crearManejador;
	
	public TarifaControlador(TarifaListarManejador consultarManejador,
			TarifaCrearManejador crearManejador) {
		this.consultarManejador = consultarManejador;
		this.crearManejador = crearManejador;
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void crearTarifa(@RequestBody TarifaComando comandoCliente) {
		this.crearManejador.ejecutar(comandoCliente);
	}
	
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<Tarifa> listarTarifas() {
		return this.consultarManejador.ejecutar();
	}
	
}
