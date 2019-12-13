import { Component, OnInit } from "@angular/core";
import { ReservaService } from "../../../service/reserva.service";
import { Reserva } from "../../../shared/reserva";
import { FiltroReserva } from "../../../shared/filtroReserva";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { MatTableDataSource } from "@angular/material";
import { Cancha } from "src/app/feature/cancha/shared/Cancha";
import { markFormGroupTouched } from "src/app/shared/utils";
import { NO_DATA, DO_SEARCH } from "src/app/shared/var.const";
import { CanchaService } from "src/app/feature/cancha/service/cancha.service";

@Component({
  selector: "app-reserva-listar",
  templateUrl: "./reserva-listar.component.html",
  styleUrls: ["./reserva-listar.component.css"]
})
export class ReservaListarComponent implements OnInit {
  reservas: Reserva[];
  canchas: Cancha[];

  infoMessage: string;

  form: FormGroup;
  displayedColumns = ["usuario", "cancha", "horaInicio", "horaFin","costo"];
  dataSource: MatTableDataSource<Reserva>;

  constructor(
    private service: ReservaService,
    private canchaServise: CanchaService
  ) {}

  ngOnInit() {
    this.form = new FormGroup({
      canchaFormCtrl: new FormControl("", Validators.required),
      fechaFormCtrl: new FormControl(new Date(), Validators.required)
    });
    this.dataSource = new MatTableDataSource();
    this.infoMessage = DO_SEARCH;

    this.canchaServise.listar().subscribe(data => (this.canchas = data));
  }

  buscar() {
    if (!this.form.valid) {
      markFormGroupTouched(this.form);
      return;
    }
    let filtro = new FiltroReserva(
      this.form.value["fechaFormCtrl"],
      this.form.value["canchaFormCtrl"]
    );
    this.service.listar(filtro).subscribe(
      (data: Reserva[]) => {
        this.dataSource = new MatTableDataSource(data);

        this.infoMessage = data.length === 0 ? NO_DATA : "";
      },
      err => console.log(err)
    );
  }
}
