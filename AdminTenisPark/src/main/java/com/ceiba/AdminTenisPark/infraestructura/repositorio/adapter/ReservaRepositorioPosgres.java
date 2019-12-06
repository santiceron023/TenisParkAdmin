package com.ceiba.AdminTenisPark.infraestructura.repositorio.adapter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.modelo.dto.FiltroReserva;
import com.ceiba.AdminTenisPark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.AdminTenisPark.infraestructura.repositorio.entity.ReservaEntity;
import com.ceiba.AdminTenisPark.infraestructura.repositorioJpa.ReservaRepositorioJpa;


@Repository
public class ReservaRepositorioPosgres implements ReservaRepositorio {
	
	private ModelMapper modelMapper = new ModelMapper();
	private final ReservaRepositorioJpa repositorioReservaJpa;

	//inyeccion de dep
	public ReservaRepositorioPosgres(ReservaRepositorioJpa repositorioReservaJpa) {
		this.repositorioReservaJpa = repositorioReservaJpa;
	}

	@Override
	public void crear(Reserva reserva) {
		  ReservaEntity reservaEntity = modelMapper.map(reserva, ReservaEntity.class);
		  repositorioReservaJpa.save(reservaEntity);				
	}

	@Override
	public boolean reservaExiste(Reserva reserva) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Reserva> listarReservas(FiltroReserva filtro) {
		LocalDateTime inicio = LocalDateTime.of(filtro.getDia(), LocalTime.MIDNIGHT);
		LocalDateTime fin = LocalDateTime.of(filtro.getDia(), LocalTime.MAX);
		List<ReservaEntity> reservasEntity = 
				repositorioReservaJpa.obtenerFiltro(inicio, fin, filtro.getCancha());
		List<Reserva> reservas = new ArrayList<>();
		for (ReservaEntity reservaEntity : reservasEntity) {
			reservas.add(new ModelMapper().map(reservaEntity, Reserva.class));
		}
		return reservas;
	}

}
