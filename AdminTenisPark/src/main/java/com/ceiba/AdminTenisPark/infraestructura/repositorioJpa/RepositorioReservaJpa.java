package com.ceiba.AdminTenisPark.infraestructura.repositorioJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ceiba.AdminTenisPark.infraestructura.repositorio.entity.ReservaEntity;

public interface RepositorioReservaJpa extends JpaRepository<ReservaEntity, Integer> {

}
