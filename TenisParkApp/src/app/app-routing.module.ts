import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './feature/home/home.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent},

  {
    path: 'tarifa',
    loadChildren: () =>
      import('./feature/tarifa/tarifa.module').then(mod => mod.TarifaModule)
  },
  {
    path: 'reserva',
    loadChildren: () =>
      import('./feature/reserva/reserva.module').then(mod => mod.ReservaModule)
  },

  {
    path: 'cancha',
    loadChildren: () =>
      import('./feature/cancha/cancha.module').then(mod => mod.CanchaModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
