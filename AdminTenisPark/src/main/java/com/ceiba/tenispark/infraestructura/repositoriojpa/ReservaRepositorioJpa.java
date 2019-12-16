package com.ceiba.tenispark.infraestructura.repositoriojpa;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.tenispark.infraestructura.repositorio.entity.ReservaEntity;

public interface ReservaRepositorioJpa extends JpaRepository<ReservaEntity, Integer> {

	@Query(value="FROM ReservaEntity r WHERE "
			+ "( :fechaIni <= r.fechaInicio AND :fechaFin >= r.fechaFin ) "
			+ "AND r.cancha.id = :cancha")
	List<ReservaEntity> obtenerFiltro(@Param("fechaIni") LocalDateTime inicio,
			@Param("fechaFin") LocalDateTime fin,
			@Param("cancha")Integer numeroCancha);
	
}
