package com.ceiba.tenispark.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.modelo.dto.FiltroReservaDto;

public interface ReservaRepositorio {
	
	 void crear(Reserva reserva);
	 boolean reservaExiste(Reserva reserva);
	 List<Reserva> listarReservas(FiltroReservaDto filtro);
	
}
