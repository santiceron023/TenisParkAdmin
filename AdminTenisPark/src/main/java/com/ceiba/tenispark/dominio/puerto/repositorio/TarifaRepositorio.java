package com.ceiba.tenispark.dominio.puerto.repositorio;

import com.ceiba.tenispark.dominio.modelo.Tarifa;

public interface TarifaRepositorio {	
	Tarifa consultar(int dia);
	void crear(Tarifa tarifa);
}
