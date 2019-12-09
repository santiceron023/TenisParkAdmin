import { Component, OnInit } from '@angular/core';

import { ProductoService } from '../../shared/service/producto.service';

@Component({
  selector: 'app-listar-producto',
  templateUrl: './listar-producto.component.html',
  styleUrls: ['./listar-producto.component.css']
})
export class ListarProductoComponent implements OnInit {

  constructor(protected productoService: ProductoService) { }

  ngOnInit() {
    this.productoService.consultar();
  }

}
