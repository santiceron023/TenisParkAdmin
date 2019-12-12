package com.ceiba.tenispark.dominio.servicio.cancha;

import com.ceiba.tenispark.dominio.modelo.Cancha;
import com.ceiba.tenispark.dominio.puerto.repositorio.CanchaRepository;

public class CanchaCrearServicio {
	
	private final CanchaRepository repo;

	public CanchaCrearServicio(CanchaRepository repo) {
		this.repo = repo;
	}	

	public void ejecutar(Cancha cancha){
		repo.crear(cancha);
		
	}
	

}
