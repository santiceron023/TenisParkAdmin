package com.ceiba.tenispark.dominio.servicio.tarifa;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaConsultarServicio {
	
	private final TarifaRepositorio tarifaRepo;

	public TarifaConsultarServicio(TarifaRepositorio repo) {
		this.tarifaRepo = repo;
	}
		
	public Tarifa ejecutar(int dia) {
		return tarifaRepo.consultar(dia);
	}
	
}
