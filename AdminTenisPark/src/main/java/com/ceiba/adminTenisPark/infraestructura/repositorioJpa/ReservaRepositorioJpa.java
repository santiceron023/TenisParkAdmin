package com.ceiba.adminTenisPark.infraestructura.repositorioJpa;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ceiba.adminTenisPark.infraestructura.repositorio.entity.ReservaEntity;

public interface ReservaRepositorioJpa extends JpaRepository<ReservaEntity, Integer> {

	@Query(value="SELECT * FROM Reserva r WHERE ( r.fechaInicio BETWEEN :fechaIni AND :fechaFin ) AND"
			+ " r.cancha = :cancha",nativeQuery = true)
	List<ReservaEntity> obtenerFiltro(@Param("fechaIni") LocalDateTime inicio,
			@Param("fechaFin") LocalDateTime fin,
			@Param("cancha")Integer numeroCancha);
}
