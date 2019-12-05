package com.ceiba.AdminTenisPark.dominio.util;

public final class MESSAGES {
	
	public static String DIA_NO_VALIDO = "El d�a ingresado no es v�lido";
	public static String RESERVA_DUPLICADA = "Horario ya reservado";
	
	
	private MESSAGES(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }

}
