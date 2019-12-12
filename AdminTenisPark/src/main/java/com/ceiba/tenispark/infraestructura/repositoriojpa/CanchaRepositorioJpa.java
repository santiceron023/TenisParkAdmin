package com.ceiba.tenispark.infraestructura.repositoriojpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.tenispark.infraestructura.repositorio.entity.CanchaEntity;

public interface CanchaRepositorioJpa extends JpaRepository<CanchaEntity, Long>{

}
