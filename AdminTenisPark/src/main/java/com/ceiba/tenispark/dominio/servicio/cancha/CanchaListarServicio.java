package com.ceiba.tenispark.dominio.servicio.cancha;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Cancha;
import com.ceiba.tenispark.dominio.puerto.repositorio.CanchaRepository;

public class CanchaListarServicio {

	private final CanchaRepository repo;

	public CanchaListarServicio(CanchaRepository repo) {
		this.repo = repo;
	}


	public List<Cancha> ejecutar(){
		return repo.listar();
	}

}
