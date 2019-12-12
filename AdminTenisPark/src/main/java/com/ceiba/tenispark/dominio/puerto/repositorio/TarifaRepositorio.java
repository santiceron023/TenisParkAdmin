package com.ceiba.tenispark.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Tarifa;

public interface TarifaRepositorio {	
	List<Tarifa> listar();
	void crear(Tarifa tarifa);
}
