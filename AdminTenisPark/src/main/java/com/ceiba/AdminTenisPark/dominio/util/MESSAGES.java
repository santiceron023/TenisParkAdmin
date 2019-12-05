package com.ceiba.AdminTenisPark.dominio.util;

public final class MESSAGES {
	
	private static String DIA_NO_VALIDO = "El día ingresado no es válido";
	private static String RESERVA_DUPLICADA = "Horario ya reservado";
	
	
	private MESSAGES(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }

}
