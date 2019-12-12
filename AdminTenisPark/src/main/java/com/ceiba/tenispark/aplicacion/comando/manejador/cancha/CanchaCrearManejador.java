package com.ceiba.tenispark.aplicacion.comando.manejador.cancha;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.CanchaComando;
import com.ceiba.tenispark.aplicacion.comando.fabrica.CanchaFabrica;
import com.ceiba.tenispark.dominio.modelo.Cancha;
import com.ceiba.tenispark.dominio.puerto.repositorio.CanchaRepository;

@Component
public class CanchaCrearManejador {
	
	private final CanchaRepository repo;
	private final CanchaFabrica fabrica;
	
	public CanchaCrearManejador(CanchaRepository repo, CanchaFabrica fabrica) {
		this.repo = repo;
		this.fabrica = fabrica;
	}


	public void ejecutar(CanchaComando comando) {
		Cancha cancha = fabrica.crear(comando);
		repo.crear(cancha);
	}

}
