import { Injectable } from '@angular/core';
import { Usuario } from '../shared/Usuario';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private http: HttpClient) {}

  listar() {
    return this.http.get<Usuario[]>(`${environment.endpoint}/usuario`);
  }
}
