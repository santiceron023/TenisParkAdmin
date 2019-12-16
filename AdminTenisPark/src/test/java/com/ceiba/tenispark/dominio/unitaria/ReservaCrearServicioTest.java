package com.ceiba.tenispark.dominio.unitaria;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;
import com.ceiba.tenispark.dominio.modelo.Reserva;
import com.ceiba.tenispark.dominio.puerto.repositorio.ReservaRepositorio;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaConsultarServicio;
import com.ceiba.tenispark.dominio.servicio.reserva.ReservaCrearServicio;
import com.ceiba.tenispark.dominio.testDataBuilder.ReservaTestDataBuilder;



public class ReservaCrearServicioTest {

	@Test
	public void CrearDuplicado(){
		// arrange

		Reserva reserva = new ReservaTestDataBuilder().build();		

		ReservaRepositorio repoMock = Mockito.mock(ReservaRepositorio.class);
		Mockito.when(repoMock.reservaExiste(reserva)).thenReturn(true);

		ReservaConsultarServicio servicioConsultar = new ReservaConsultarServicio(repoMock);
		ReservaCrearServicio serviciocrear = new ReservaCrearServicio(repoMock,servicioConsultar);

		// act - assert
		assertThrows( ExcepcionDominio.class,() ->
		serviciocrear.ejecutar(reserva) );
	}

	@Test
	public void utilidad() {
		// arrange

		Reserva reserva = new ReservaTestDataBuilder().build();
		List<Reserva> listaReservas = Arrays.asList(reserva);

		ReservaRepositorio repoMock = Mockito.mock(ReservaRepositorio.class);
		ReservaConsultarServicio servicioConsMock = Mockito.mock(ReservaConsultarServicio.class);
		ReservaCrearServicio serviciocrear = new ReservaCrearServicio(repoMock,servicioConsMock);

		Mockito.when(repoMock.reservaExiste(reserva)).thenReturn(false);		
		
		//match the actual call not the signature only!!!!!!!!!!!! (FiltroReservaDto.class)
		Mockito.when(servicioConsMock.ejecutar(ArgumentMatchers.any())).thenReturn(listaReservas);
		
		// act
		// assert
		assertThrows( ExcepcionDominio.class,() ->
		serviciocrear.ejecutar(reserva) );


	}
}
