import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanchaComponent } from './components/cancha/cancha.component';
import { CanchaCrearComponent } from './components/cancha-crear/cancha-crear.component';


const routes: Routes = [
  {
    path: '',
    component: CanchaComponent,
    children: [
      {
        path: 'crear',
        component: CanchaCrearComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CanchaRoutingModule { }
