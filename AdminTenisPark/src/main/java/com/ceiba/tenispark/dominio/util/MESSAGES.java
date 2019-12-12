package com.ceiba.tenispark.dominio.util;

public final class MESSAGES {
	
	public static final String DIA_NO_VALIDO = "El día ingresado no es válido";
	public static final String RESERVA_DUPLICADA = "Horario ya reservado";
	public static final String CONSTRAIN_VIOLADO = "Argumento Obligatorio no lleno";
	public static final String FECHAS_NOVALIDAS = "Fechas no válidas";
	
	
	private MESSAGES(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }

}
