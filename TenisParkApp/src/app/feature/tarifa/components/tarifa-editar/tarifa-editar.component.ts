import { Component, OnInit } from "@angular/core";
import { FormControl, Validators, FormGroup } from "@angular/forms";
import { Router, ActivatedRoute, Params } from "@angular/router";
import { TarifaService } from "../../service/tarifa.service";
import { Tarifa } from "../../shared/tarifa";

@Component({
  selector: "app-tarifa-editar",
  templateUrl: "./tarifa-editar.component.html",
  styleUrls: ["./tarifa-editar.component.css"]
})
export class TarifaEditarComponent implements OnInit {
  form:FormGroup;
  id: number;

  constructor(private router: Router, private tarifaService: TarifaService) {}

  ngOnInit() {
    this.form = new FormGroup({
      'tarifaFormCtrl': new FormControl(this.tarifaService.tarifaEditar.costo,Validators.required)
    });
  }

  save() {
    let tarifa = new Tarifa(
      this.tarifaService.tarifaEditar.dia,
      this.form.get('tarifaFormCtrl').value
    );
    this.tarifaService.crear(tarifa).subscribe(data => {
      this.tarifaService.tarifaEditar = null;
      this.tarifaService.recargar.next(true);
      this.router.navigateByUrl("/tarifa");
    });
  }
}
