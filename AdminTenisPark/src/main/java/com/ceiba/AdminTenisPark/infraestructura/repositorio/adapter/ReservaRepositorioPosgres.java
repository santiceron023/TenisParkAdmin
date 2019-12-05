package com.ceiba.AdminTenisPark.infraestructura.repositorio.adapter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.AdminTenisPark.infraestructura.repositorio.entity.ReservaEntity;
import com.ceiba.AdminTenisPark.infraestructura.repositorioJpa.ReservaRepositorioJpa;


@Repository
public class ReservaRepositorioPosgres implements ReservaRepositorio {
	
	private ModelMapper modelMapper = new ModelMapper();
	private ReservaRepositorioJpa repositorioReservaJpa;

	//inyeccion de dep
	public ReservaRepositorioPosgres(ReservaRepositorioJpa repositorioReservaJpa) {
		this.repositorioReservaJpa = repositorioReservaJpa;
	}

	@Override
	public void crear(Reserva reserva) {
		  ReservaEntity reservaEntity = modelMapper.map(reserva, ReservaEntity.class);
		  repositorioReservaJpa.save(reservaEntity);				
	}

}
