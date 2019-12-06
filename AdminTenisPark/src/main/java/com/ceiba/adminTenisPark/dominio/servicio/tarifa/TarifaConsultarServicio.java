package com.ceiba.adminTenisPark.dominio.servicio.tarifa;

import com.ceiba.adminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.adminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaConsultarServicio {
	
	private final TarifaRepositorio repo;

	public TarifaConsultarServicio(TarifaRepositorio repo) {
		this.repo = repo;
	}
		
	public Tarifa ejecutar(int dia) {
		return repo.consultar(dia);
	}
	
}
