package com.ceiba.AdminTenisPark.dominio.servicio.tarifa;

import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.TarifaRepositorio;

public class TarifaConsultarServicio {
	
	private final TarifaRepositorio repo;

	public TarifaConsultarServicio(TarifaRepositorio repo) {
		this.repo = repo;
	}
		
	public Tarifa ejecutar(int dia) {
		return repo.consultar(dia);
	}
	
}
