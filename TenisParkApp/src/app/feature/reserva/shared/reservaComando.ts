import { formatDateTime } from 'src/app/shared/utils';

export class ReservaComando {
  fechaInicio: String;
  fechaFin: String;
  usuario: number;
  cancha: number;
  numeroUsuarios: number;

  constructor(
    fecha: Date,
    horaInicio: number,
    horafin: number,
    usuario: number,
    cancha: number,
    numeroUsuarios: number
  ) {
    this.fechaInicio = formatDateTime(fecha,horaInicio);
    this.fechaFin = formatDateTime(fecha,horafin);
    this.cancha = cancha;
    this.usuario = usuario;
    this.numeroUsuarios = numeroUsuarios;
  }
}
