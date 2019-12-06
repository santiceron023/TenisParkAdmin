package com.ceiba.tenispark.dominio.servicio.tarifa;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaCrearServicio {
	
	private final TarifaRepositorio tarifaRepo;
	
	public TarifaCrearServicio(TarifaRepositorio repo) {
		this.tarifaRepo = repo;
	}
	
	public void ejecutar(Tarifa tarifa) {
		tarifaRepo.crear(tarifa);
	}	
	

}
