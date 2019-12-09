import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../../shared/service/producto.service';
import { Producto } from '../../shared/model/producto';

@Component({
  selector: 'app-producto',
  templateUrl: './producto.component.html',
  styleUrls: ['./producto.component.css']
})
export class ProductoComponent implements OnInit {

  constructor(protected productoServices: ProductoService) { }

  ngOnInit() {
  }

  cerar(producto: Producto) {
    this.productoServices.guardar(producto);
  }

}
