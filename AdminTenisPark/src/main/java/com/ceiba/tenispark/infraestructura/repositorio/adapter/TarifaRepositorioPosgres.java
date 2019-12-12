package com.ceiba.tenispark.infraestructura.repositorio.adapter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.tenispark.dominio.modelo.Tarifa;
import com.ceiba.tenispark.dominio.puerto.repositorio.TarifaRepositorio;
import com.ceiba.tenispark.infraestructura.repositorio.entity.TarifaEntity;
import com.ceiba.tenispark.infraestructura.repositoriojpa.TarifaRespositorioJpa;

@Repository
public class TarifaRepositorioPosgres implements TarifaRepositorio{

	private final TarifaRespositorioJpa repoJpa;	
	private ModelMapper modelMapper = new ModelMapper();

	public TarifaRepositorioPosgres(TarifaRespositorioJpa repoJpa) {
		this.repoJpa = repoJpa;
	}

	@Override
	public List<Tarifa> listar() {
		List<TarifaEntity> tarifaEntities = repoJpa.findAll();
		List<Tarifa> tarifas = new ArrayList<>();
		for (TarifaEntity tarifaEntity : tarifaEntities) {
			tarifas.add(modelMapper.map(tarifaEntity, Tarifa.class));			
		}
		return tarifas;
	}

	@Override
	public void crear(Tarifa tarifa) {
		TarifaEntity entity = modelMapper.map(tarifa, TarifaEntity.class);
		repoJpa.save(entity);
	}

}
