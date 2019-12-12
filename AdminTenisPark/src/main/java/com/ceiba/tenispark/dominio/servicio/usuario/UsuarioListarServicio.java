package com.ceiba.tenispark.dominio.servicio.usuario;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Usuario;
import com.ceiba.tenispark.dominio.puerto.repositorio.UsuarioRepositorio;

public class UsuarioListarServicio {

	private final UsuarioRepositorio repo;

	public UsuarioListarServicio(UsuarioRepositorio repo) {
		this.repo = repo;
	}

	public List<Usuario> ejecutar() {
		return repo.listar();
	}

}
