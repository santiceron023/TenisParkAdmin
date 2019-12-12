package com.ceiba.tenispark.dominio.testDataBuilder;

import com.ceiba.tenispark.dominio.modelo.Usuario;

public class UsuarioTestDataBuilder {
	private static final String NOMBRE = "juan carlos restrepo" ;
	private static final Integer ID = 1;
	private static final String TELEFONO = "345 586 8855";
	private static final Integer IDENTIFICACION = 123456;
	


	public Usuario build() {
		return new Usuario(ID, NOMBRE, TELEFONO, IDENTIFICACION);
	}


}
