package com.ceiba.tenispark.infraestructura.repositorio.adapter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.infraestructura.repositorio.entity.ReservaEntity;
import com.ceiba.tenispark.infraestructura.repositoriojpa.ReservaRepositorioJpa;


@Repository
public class ReservaRepositorioPosgres implements ReservaRepositorio {

	private ModelMapper modelMapper = new ModelMapper();
	private final ReservaRepositorioJpa repositorioReservaJpa;

	//inyeccion de dependencias
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
		List<ReservaEntity> result = repositorioReservaJpa.obtenerFiltro
				(reserva.getFechaInicio(), reserva.getFechaFin(), reserva.getCancha().getId());
		if(result.isEmpty()) {
			return Boolean.FALSE;
		}else{
			return Boolean.TRUE;
		}
	}

	@Override
	public List<Reserva> listarReservas(FiltroReservaDto filtro) {
		Optional<ReservaEntity> a = repositorioReservaJpa.findById(1);
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
