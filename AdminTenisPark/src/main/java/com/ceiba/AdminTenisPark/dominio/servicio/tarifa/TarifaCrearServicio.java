package com.ceiba.AdminTenisPark.dominio.servicio.tarifa;

import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaCrearServicio {
	
	TarifaRepositorio tarifaRepo;
	
	public TarifaCrearServicio(TarifaRepositorio repo) {
		this.tarifaRepo = repo;
	}
	
	public void ejecutar(Tarifa tarifa) {
		tarifaRepo.crear(tarifa);
	}
	

}
