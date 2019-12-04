package com.ceiba.AdminTenisPark.infraestructura.repositorio.adapter;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.AdminTenisPark.infraestructura.repositorioJpa.RepositorioReservaJpa;

@Repository
public class RepositorioReservaImpl implements RepositorioReserva {
	
	private ModelMapper modelMapper = new ModelMapper();
	private RepositorioReservaJpa repositorioReservaJpa;

	@Override
	public void crear(Reserva reserva) {
				
	}

}
