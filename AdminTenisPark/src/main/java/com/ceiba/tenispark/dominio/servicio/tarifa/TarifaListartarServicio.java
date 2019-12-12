package com.ceiba.tenispark.dominio.servicio.tarifa;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaListartarServicio {
	
	private final TarifaRepositorio tarifaRepo;

	public TarifaListartarServicio(TarifaRepositorio repo) {
		this.tarifaRepo = repo;
	}
		
	public List<Tarifa> ejecutar() {
		return tarifaRepo.listar();
	}
	
}
