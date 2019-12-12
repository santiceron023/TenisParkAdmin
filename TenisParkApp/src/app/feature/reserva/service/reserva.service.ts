import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { Reserva } from "../shared/reserva";
import { FiltroReserva } from "../shared/filtroReserva";
import { environment } from "src/environments/environment";
import { ReservaComando } from '../shared/reservaComando';

@Injectable({
  providedIn: "root"
})
export class ReservaService {
  constructor(private http: HttpClient) {}

  listar(filtro: FiltroReserva) {
    let params = new HttpParams()
      .append("cancha", filtro.cancha.toString())
      .append("fecha", filtro.dia.toString());
      
    return this.http.get<Reserva[]>(`${environment.endpoint}/reserva`, {
      params: params
    });
  }

  crear(reserva: ReservaComando) {   
    return this.http.post(`${environment.endpoint}/reserva`,reserva);
  }

}
