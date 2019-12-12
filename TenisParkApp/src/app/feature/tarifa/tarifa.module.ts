import { NgModule } from "@angular/core";

import { SharedModule } from "src/app/shared/shared.module";
import { MaterialModule } from "src/app/shared/material.module";
import { TarifaRoutingModule } from "./tarifa-routing.module";
import { TarifaComponent } from './components/tarifa.component';
import { TarifaEditarComponent } from './components/tarifa-editar/tarifa-editar.component';

@NgModule({
  declarations: [TarifaComponent,TarifaEditarComponent],
  imports: [TarifaRoutingModule, SharedModule, MaterialModule]
})
export class TarifaModule {}
