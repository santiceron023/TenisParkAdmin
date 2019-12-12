import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cancha } from '../shared/Cancha';
import { environment } from 'src/environments/environment';
import { BehaviorSubject } from 'rxjs';
import { MatTableDataSource } from '@angular/material';

@Injectable({
  providedIn: 'root'
})
export class CanchaService {

  dataSource:MatTableDataSource<Cancha>

  recargar = new BehaviorSubject<boolean>(false);

  constructor(private http: HttpClient) {}

  listar() {
    return this.http.get<Cancha[]>(`${environment.endpoint}/cancha`);
  }

  crear(cancha: Cancha) {   
    return this.http.post(`${environment.endpoint}/cancha`,cancha);
  }
}
