package com.ceiba.tenispark.infraestructura.repositorio.adapter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import com.ceiba.tenispark.dominio.modelo.Cancha;
import com.ceiba.tenispark.dominio.puerto.repositorio.CanchaRepository;
import com.ceiba.tenispark.infraestructura.repositorio.entity.CanchaEntity;
import com.ceiba.tenispark.infraestructura.repositoriojpa.CanchaRepositorioJpa;

@Repository
public class CanchaRepositoryPosgres implements CanchaRepository{
	
	private final CanchaRepositorioJpa repoJpa;
	private ModelMapper modelMapper = new ModelMapper();

	public CanchaRepositoryPosgres(CanchaRepositorioJpa repoJpa) {
		this.repoJpa = repoJpa;
	}

	@Override
	public void crear(Cancha cancha) {
		CanchaEntity canchaEntity = modelMapper.map(cancha, CanchaEntity.class);
		repoJpa.save(canchaEntity);
		
	}

	@Override
	public List<Cancha> listar() {
		List<CanchaEntity> repoCanchas = repoJpa.findAll();
		List<Cancha> canchas = new ArrayList<>();
		
		for (CanchaEntity canchaEntity : repoCanchas) {
			canchas.add(modelMapper.map(canchaEntity, Cancha.class));
		}
		return canchas;
		
	}
	
	

}
