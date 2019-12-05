package com.ceiba.AdminTenisPark.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.AdminTenisPark.dominio.modelo.Reserva;
import com.ceiba.AdminTenisPark.dominio.modelo.dto.FiltroReserva;

public interface ReservaRepositorio {
	
	 void crear(Reserva reserva);
	 boolean reservaExiste(Reserva reserva);
	 List<Reserva> listarReservas(FiltroReserva filtro);
	
}
