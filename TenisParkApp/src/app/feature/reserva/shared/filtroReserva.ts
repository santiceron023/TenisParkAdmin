import { formatDate } from 'src/app/shared/utils';

export class FiltroReserva {
  dia: string;
  cancha: number;
  
  constructor(dia: Date, cancha: number) {
      this.cancha = cancha;
      this.dia = formatDate(dia);
  }
}
