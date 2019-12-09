package com.ceiba.tenispark.infraestructura.repositorio.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


/**
 * @author santiago.ceron
 *
 */
@Entity
@Table(name="reserva")
public class ReservaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tarifa",nullable= false, foreignKey = @ForeignKey(name = "reserva_tarifa") )
	private TarifaEntity tarifa;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario",nullable= true, foreignKey = @ForeignKey(name = "reserva_usuario") )
	private UsuarioEntity usuario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cancha",nullable= true, foreignKey = @ForeignKey(name = "reserva_cancha") )
	private CanchaEntity cancha;

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
	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TarifaEntity getTarifa() {
		return tarifa;
	}

	public void setTarifa(TarifaEntity tarifa) {
		this.tarifa = tarifa;
	}

	public CanchaEntity getCancha() {
		return cancha;
	}

	public void setCancha(CanchaEntity cancha) {
		this.cancha = cancha;
	}


}
