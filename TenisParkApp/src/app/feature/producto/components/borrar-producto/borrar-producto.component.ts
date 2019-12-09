import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../../shared/service/producto.service';
import { Producto } from '../../shared/model/producto';

@Component({
  selector: 'app-borrar-producto',
  templateUrl: './borrar-producto.component.html',
  styleUrls: ['./borrar-producto.component.css']
})
export class BorrarProductoComponent implements OnInit {


  constructor(protected productoServices: ProductoService) { }

  ngOnInit() {
  }

  cerar(producto: Producto) {
    this.productoServices.guardar(producto);
  }

}
