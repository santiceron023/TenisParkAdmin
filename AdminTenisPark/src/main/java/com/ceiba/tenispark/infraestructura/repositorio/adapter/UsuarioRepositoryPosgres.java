package com.ceiba.tenispark.infraestructura.repositorio.adapter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.ceiba.tenispark.dominio.modelo.Usuario;
import com.ceiba.tenispark.dominio.puerto.repositorio.UsuarioRepositorio;
import com.ceiba.tenispark.infraestructura.repositorio.entity.UsuarioEntity;
import com.ceiba.tenispark.infraestructura.repositoriojpa.UsuarioRepositoryJpa;

@Repository
public class UsuarioRepositoryPosgres implements UsuarioRepositorio {
	
	private final UsuarioRepositoryJpa jpaRepostory;	
	private ModelMapper modelMapper = new ModelMapper();
	

	public UsuarioRepositoryPosgres(UsuarioRepositoryJpa jpaRepostory) {
		this.jpaRepostory = jpaRepostory;
	}


	@Override
	public List<Usuario> listar() {
		List<UsuarioEntity> usuariosEntity = jpaRepostory.findAll();
		List<Usuario> usuarios = new ArrayList<>();
		for (UsuarioEntity usuarioEntity : usuariosEntity) {
			usuarios.add(modelMapper.map(usuarioEntity, Usuario.class));
		}
		return usuarios;
		
	}	
	
	
}
