package com.ceiba.AdminTenisPark.dominio.puerto.repositorio;

import com.ceiba.AdminTenisPark.dominio.modelo.Tarifa;

public interface TarifaRepositorio {	
	Tarifa consultar(int dia);
	void crear(Tarifa tarifa);
}
