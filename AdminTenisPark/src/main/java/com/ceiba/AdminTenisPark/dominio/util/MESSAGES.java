package com.ceiba.AdminTenisPark.dominio.util;

public final class MESSAGES {
	
	public static String DIA_NO_VALIDO = "El día ingresado no es válido";
	public static String RESERVA_DUPLICADA = "Horario ya reservado";
	
	
	private MESSAGES(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }

}
