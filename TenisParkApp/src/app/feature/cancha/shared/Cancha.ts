export class Cancha {
  id: number;
  administrador: string;
  telefono: string;

  constructor(id: number, administrador: string, telefono: string) {
    this.id = id;
    this.administrador = administrador;
    this.telefono = telefono;
  }
}
