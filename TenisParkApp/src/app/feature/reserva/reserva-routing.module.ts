import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ReservaListarComponent } from './components/reserva/reserva-listar/reserva-listar.component';
import { ReservaCrearComponent } from './components/reserva/reserva-crear/reserva-crear.component';
import { ReservaComponent } from './components/reserva/reserva.component';


const routes: Routes = [
  {
    path: '',
    component: ReservaComponent,
    children: [
      {
        path: 'crear',
        component: ReservaCrearComponent
      },
      {
        path: 'listar',
        component: ReservaListarComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ReservaRoutingModule { }
