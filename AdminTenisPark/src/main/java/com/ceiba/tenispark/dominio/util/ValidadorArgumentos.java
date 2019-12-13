package com.ceiba.tenispark.dominio.util;


import java.time.LocalDateTime;
import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;

public final class ValidadorArgumentos {

	private ValidadorArgumentos() {
		 //this prevents even the class from calling this ctor as well :
	    throw new AssertionError();
	}	

	public static void validarDia(int dia) {
		if(dia>7 || dia == 0) {
			throw new ExcepcionDominio(MESSAGES.DIA_NO_VALIDO);
		}

	}
	
	public static void validarNoVacio(Object valor) {
		if(valor == null) {
			throw new ExcepcionDominio(MESSAGES.CONSTRAIN_VIOLADO);
		}
	}
	
	public static void validarFechas(LocalDateTime inicio,LocalDateTime fin) {
		if(inicio.isAfter(fin)) {
			throw new ExcepcionDominio(MESSAGES.FECHAS_NOVALIDAS);
		}

	}

}
