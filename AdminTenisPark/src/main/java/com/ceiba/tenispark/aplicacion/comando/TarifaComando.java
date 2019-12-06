package com.ceiba.tenispark.aplicacion.comando;

public class TarifaComando {
	
	private Integer costo;
	private Integer dia;
	
	public TarifaComando(Integer costo, Integer dia) {
		this.costo = costo;
		this.dia = dia;
	}
	
	public TarifaComando() {
	}

	public Integer getCosto() {
		return costo;
	}
	public void setCosto(Integer tarifa) {
		this.costo = tarifa;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}


}
