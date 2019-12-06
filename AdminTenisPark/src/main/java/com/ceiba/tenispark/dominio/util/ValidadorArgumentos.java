package com.ceiba.tenispark.dominio.util;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;

public final class ValidadorArgumentos {

	private ValidadorArgumentos() {
	}	

	public static void validarDia(int dia) {
		if(dia>7 || dia == 0) {
			throw new ExcepcionDominio(MESSAGES.DIA_NO_VALIDO);
		}

	}
	
	public static void validarNoVacio(Integer valor) {
		if(valor == null) {
			throw new ExcepcionDominio(MESSAGES.CONTRAIN_VIOLADO);
		}
	}

}
