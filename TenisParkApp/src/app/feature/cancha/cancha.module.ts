import { NgModule } from "@angular/core";

import { CanchaRoutingModule } from "./cancha-routing.module";
import { SharedModule } from "src/app/shared/shared.module";
import { MaterialModule } from "src/app/shared/material.module";
import { CanchaComponent } from "./components/cancha/cancha.component";
import { CanchaCrearComponent } from "./components/cancha-crear/cancha-crear.component";

@NgModule({
  declarations: [CanchaComponent, CanchaCrearComponent],
  imports: [CanchaRoutingModule, SharedModule, MaterialModule]
})
export class CanchaModule {}
