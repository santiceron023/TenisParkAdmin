import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TarifaComponent } from './components/tarifa.component';
import { TarifaEditarComponent } from './components/tarifa-editar/tarifa-editar.component';


const routes: Routes = [
  {
    path: '',
    component: TarifaComponent,
    children: [
      {
        path: 'editar',
        component: TarifaEditarComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TarifaRoutingModule { }
