package com.ceiba.tenispark.infraestructura.repositoriojpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.tenispark.infraestructura.repositorio.entity.TarifaEntity;

public interface TarifaRespositorioJpa extends JpaRepository<TarifaEntity, Integer>{
	
	@Query(value = "select * from tarifa t where t.dia = :idDia",nativeQuery = true)
	TarifaEntity consultarPorDia(@Param("idDia")Integer dia);

}
