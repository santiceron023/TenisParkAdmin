package com.ceiba.adminTenisPark.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adminTenisPark.dominio.modelo.Reserva;
import com.ceiba.adminTenisPark.dominio.modelo.dto.FiltroReserva;

public interface ReservaRepositorio {
	
	 void crear(Reserva reserva);
	 boolean reservaExiste(Reserva reserva);
	 List<Reserva> listarReservas(FiltroReserva filtro);
	
}
