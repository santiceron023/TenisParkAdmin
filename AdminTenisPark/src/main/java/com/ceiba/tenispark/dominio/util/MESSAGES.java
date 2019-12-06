package com.ceiba.tenispark.dominio.util;

public final class MESSAGES {
	
	public static final String DIA_NO_VALIDO = "El d�a ingresado no es v�lido";
	public static final String RESERVA_DUPLICADA = "Horario ya reservado";
	public static final String CONTRAIN_VIOLADO = "Argumento Obligatorio no lleno";
	
	
	private MESSAGES(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }

}
