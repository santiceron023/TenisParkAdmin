import { Tarifa } from 'src/app/feature/tarifa/shared/tarifa';
import { Usuario } from '../../usuario/shared/Usuario';
import { Cancha } from '../../cancha/shared/Cancha';

export class Reserva {
  fechaInicio: Date;
  fechaFin: Date;
  tarifa: Tarifa;
  usuario: Usuario;
  cancha: Cancha;
  numeroUsuarios: number;
}
