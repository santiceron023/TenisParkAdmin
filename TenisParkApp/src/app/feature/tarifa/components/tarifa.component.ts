import { Component, OnInit } from "@angular/core";
import { Cancha } from "../../cancha/shared/Cancha";
import { Tarifa } from "../shared/tarifa";
import { FormGroup } from "@angular/forms";
import { TarifaService } from "../service/tarifa.service";
import { MatTableDataSource } from "@angular/material";
import { Router } from "@angular/router";

@Component({
  selector: "app-tarifa",
  templateUrl: "./tarifa.component.html",
  styleUrls: ["./tarifa.component.css"]
})
export class TarifaComponent implements OnInit {
  form: FormGroup;
  canchas: Cancha[];
  infoMessage: string;
  tarifas: Tarifa[];

  displayedColumns = ["dia", "tarifa", "acciones"];
  dataSource: MatTableDataSource<Tarifa>;

  constructor(private tarifService: TarifaService, private router: Router) {}

  ngOnInit() {
    this.setDatadable();

    this.tarifService.recargar.subscribe((data:boolean)=>
    {
      if(data) {
        this.setDatadable();
        this.tarifService.recargar.next(false);
      }
    });
  }

  setDatadable() {
    this.tarifService.listar().subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
    });
  }

  modificar(tarifa: Tarifa) {
    this.tarifService.tarifaEditar = tarifa;
    this.router.navigateByUrl("/tarifa/editar");
  }
}
