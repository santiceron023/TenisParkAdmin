import { NgModule } from '@angular/core';

import { ReservaRoutingModule } from './reserva-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
import { ReservaComponent } from './components/reserva/reserva.component';
import { ReservaListarComponent } from './components/reserva/reserva-listar/reserva-listar.component';
import { ReservaCrearComponent } from './components/reserva/reserva-crear/reserva-crear.component';
import { MaterialModule } from 'src/app/shared/material.module';

@NgModule({
  declarations: [
    ReservaComponent,
    ReservaListarComponent,
    ReservaCrearComponent
  ],
  imports: [
    ReservaRoutingModule,
    SharedModule,
    MaterialModule
  ]
})
export class ReservaModule { }
