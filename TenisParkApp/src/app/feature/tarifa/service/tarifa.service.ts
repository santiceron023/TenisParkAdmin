import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Tarifa } from '../shared/tarifa';
import { environment } from 'src/environments/environment';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TarifaService {

  recargar = new BehaviorSubject<boolean>(false);
  tarifaEditar:Tarifa;

  constructor(private http:HttpClient) { }

  listar() {
    return this.http.get<Tarifa[]>(`${environment.endpoint}/tarifa`);
  }

  crear(tarifa: Tarifa) {   
    return this.http.post(`${environment.endpoint}/tarifa`,tarifa);
  }
}
