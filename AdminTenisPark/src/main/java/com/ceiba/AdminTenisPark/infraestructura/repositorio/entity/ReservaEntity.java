package com.ceiba.AdminTenisPark.infraestructura.repositorio.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


@Entity
@Table(name="reserva")
public class ReservaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

//	@ManyToOne
//	@JoinColumn(name = "id_tarifa",nullable= false, foreignKey = @ForeignKey(name = "reserva_tarifa") )
//	private Tarifa tarifa;
//
//	@ManyToOne
//	@JoinColumn(name = "id_usuario",nullable= false, foreignKey = @ForeignKey(name = "reserva_usuario") )
//	private Usuario usuario;
//
//	@ManyToOne
//	@JoinColumn(name = "id_cancha",nullable= false, foreignKey = @ForeignKey(name = "reserva_cancha") )
//	private Cancha cancha;

	//dar formato a la fecha  ISODate 2019-10-01T05:00:00.000
	@Column
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaInicio;		
	
	@Column
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechaFin;	
		
	@Column(length = 1)
	private Integer numeroUsuarios;

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public void setNumeroUsuarios(Integer numeroUsuarios) {
		this.numeroUsuarios = numeroUsuarios;
	}
	
}
