package com.ceiba.tenispark.infraestructura.repositoriojpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ceiba.tenispark.infraestructura.repositorio.entity.UsuarioEntity;

public interface UsuarioRepositoryJpa extends JpaRepository<UsuarioEntity, Integer>{

}
