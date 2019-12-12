package com.ceiba.tenispark.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Cancha;

public interface CanchaRepository {
	public void crear(Cancha cacnha);
	public List<Cancha> listar();

}
