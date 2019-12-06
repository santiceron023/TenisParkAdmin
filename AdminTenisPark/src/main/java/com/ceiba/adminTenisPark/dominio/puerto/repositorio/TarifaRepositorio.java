package com.ceiba.adminTenisPark.dominio.puerto.repositorio;

import com.ceiba.adminTenisPark.dominio.modelo.Tarifa;

public interface TarifaRepositorio {	
	Tarifa consultar(int dia);
	void crear(Tarifa tarifa);
}
