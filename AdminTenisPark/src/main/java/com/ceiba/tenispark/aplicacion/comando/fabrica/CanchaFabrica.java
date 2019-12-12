package com.ceiba.tenispark.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.tenispark.aplicacion.comando.CanchaComando;
import com.ceiba.tenispark.dominio.modelo.Cancha;

@Component
public class CanchaFabrica{
	
	public Cancha crear(CanchaComando comando) {
		return new Cancha(comando.getId(), comando.getAdministrador(), comando.getTelefono());
	}

}
