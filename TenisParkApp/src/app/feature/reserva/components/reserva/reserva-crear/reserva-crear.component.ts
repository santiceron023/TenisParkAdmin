import { Component, OnInit } from "@angular/core";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { Cancha } from "src/app/feature/cancha/shared/Cancha";
import { Usuario } from "src/app/feature/usuario/shared/Usuario";
import { ReservaService } from "../../../service/reserva.service";
import { ReservaComando } from "../../../shared/reservaComando";
import { CanchaService } from 'src/app/feature/cancha/service/cancha.service';
import { UsuarioService } from 'src/app/feature/usuario/service/usuario.service';
import { Tarifa } from 'src/app/feature/tarifa/shared/tarifa';
import { TarifaService } from 'src/app/feature/tarifa/service/tarifa.service';
import { MatDialog } from '@angular/material';
import { AlertDialogComponent } from 'src/app/shared/alert/alert-dialog/alert-dialog.component';
import { MSG_CREATED } from 'src/app/shared/var.const';

@Component({
  selector: "app-reserva-crear",
  templateUrl: "./reserva-crear.component.html",
  styleUrls: ["./reserva-crear.component.css"]
})
export class ReservaCrearComponent implements OnInit {
  form: FormGroup;

  minFecha: Date = new Date();

  canchas: Cancha[];
  usuarios: Usuario[];
  tarifas: Tarifa[];

  constructor(private reservaService: ReservaService,
    private canchaService:CanchaService,
    private tarifaService:TarifaService,
    private matDialog:MatDialog,
    private usuarioService:UsuarioService) {}

  ngOnInit() {
    this.form = new FormGroup({
      canchaFormCtrl: new FormControl("",Validators.required),
      usuarioFormCtrl: new FormControl("",Validators.required),
      cantidadFormCtrl: new FormControl("",Validators.required),
      horaInicioFormCtrl: new FormControl("",Validators.required),
      horaFinFormCtrl: new FormControl("",Validators.required),
      fechaFormCtrl: new FormControl("",Validators.required)
    });
    
    this.canchaService.listar().subscribe(
      (data) => this.canchas = data
    );
    
    this.usuarioService.listar().subscribe(
      (data) => this.usuarios = data
    );
    
    this.tarifaService.listar().subscribe(
      (data) => this.tarifas = data
    );


  }

  guardar() {
    let reseva = new ReservaComando(
      this.form.value["fechaFormCtrl"],
      this.form.value["horaInicioFormCtrl"],
      this.form.value["horaFinFormCtrl"],
      this.form.value["usuarioFormCtrl"],
      this.form.value["canchaFormCtrl"],
      this.form.value["cantidadFormCtrl"]
    );
    this.reservaService.crear(reseva).subscribe(
      data =>
        this.matDialog.open(AlertDialogComponent,{data:MSG_CREATED})
      );
  }
}
