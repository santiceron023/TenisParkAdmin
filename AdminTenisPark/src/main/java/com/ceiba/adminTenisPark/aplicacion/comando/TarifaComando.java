package com.ceiba.adminTenisPark.aplicacion.comando;

public class TarifaComando {
	
	private Integer id;
	private Integer costo;
	private Integer dia;
	
	public TarifaComando(Integer id, Integer costo, Integer dia) {
		this.id = id;
		this.costo = costo;
		this.dia = dia;
	}
	
	public TarifaComando() {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
