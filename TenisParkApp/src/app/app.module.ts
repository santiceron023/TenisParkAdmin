import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { AppComponent } from "./app.component";
import { AppRoutingModule } from "./app-routing.module";
import { HomeComponent } from "./feature/home/home.component";
import { ProductoModule } from "./feature/producto/producto.module";
import { CUSTOM_ELEMENTS_SCHEMA } from "@angular/core";
import { CoreModule } from "./core/core.module";
import { CookieService } from "ngx-cookie-service";
import { NoopAnimationsModule } from "@angular/platform-browser/animations";
import { ReservaModule } from "./feature/reserva/reserva.module";
import { CanchaModule } from "./feature/cancha/cancha.module";
import { UsuarioModule } from "./feature/usuario/usuario.module";
import { TarifaModule } from "./feature/tarifa/tarifa.module";

@NgModule({
  declarations: [AppComponent, HomeComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProductoModule,
    ReservaModule,
    CanchaModule,
    TarifaModule,
    UsuarioModule,
    CoreModule,
    NoopAnimationsModule
  ],
  providers: [CookieService],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule {}
