package com.ceiba.tenispark.dominio.unitaria;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaCrearServicio;
import com.ceiba.tenispark.dominio.testDataBuilder.ReservaTestDataBuilder;



public class ReservaCrearServicioTest {

	@Test
	public void CrearDuplicado(){
		// arrange

		Reserva reserva = new ReservaTestDataBuilder().build();
		ReservaRepositorio repoMock = Mockito.spy(ReservaRepositorio.class);
		Mockito.when(repoMock.reservaExiste(reserva)).thenReturn(true);

		ReservaCrearServicio servicio = new ReservaCrearServicio(repoMock);

		// act - assert
		assertThrows( ExcepcionDominio.class,() ->
		servicio.ejecutar(reserva) );
	}
}
