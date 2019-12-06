package com.ceiba.adminTenisPark.dominio.servicio.tarifa;

import com.ceiba.adminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.adminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaCrearServicio {
	
	TarifaRepositorio tarifaRepo;
	
	public TarifaCrearServicio(TarifaRepositorio repo) {
		this.tarifaRepo = repo;
	}
	
	public void ejecutar(Tarifa tarifa) {
		tarifaRepo.crear(tarifa);
	}
	

}
