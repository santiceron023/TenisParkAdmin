package com.ceiba.tenispark.dominio.excepcion;

public class ExcepcionDominio extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public ExcepcionDominio(String mensaje){
		super(mensaje);
	}



}
