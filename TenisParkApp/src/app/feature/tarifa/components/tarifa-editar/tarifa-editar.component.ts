import { Component, OnInit } from "@angular/core";
import { FormControl, Validators, FormGroup } from "@angular/forms";
import { Router, ActivatedRoute, Params } from "@angular/router";
import { TarifaService } from "../../service/tarifa.service";
import { Tarifa } from "../../shared/tarifa";
import { MatDialog } from '@angular/material';
import { AlertDialogComponent } from 'src/app/shared/alert/alert-dialog/alert-dialog.component';
import { MSG_CREATED } from 'src/app/shared/var.const';

@Component({
  selector: "app-tarifa-editar",
  templateUrl: "./tarifa-editar.component.html",
  styleUrls: ["./tarifa-editar.component.css"]
})
export class TarifaEditarComponent implements OnInit {
  form:FormGroup;
  id: number;

  constructor(private router: Router,
    private matDialog:MatDialog,
     private tarifaService: TarifaService) {}

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
      this.matDialog.open(AlertDialogComponent,{data: MSG_CREATED});
      this.tarifaService.tarifaEditar = null;
      this.tarifaService.recargar.next(true);
      this.router.navigateByUrl("/tarifa");
    });
  }
}
