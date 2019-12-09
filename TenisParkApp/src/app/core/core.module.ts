import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SecurityGuard } from './guard/security.guard';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { TokenInterceptor } from './interceptor/token-interceptor';
import { AuthInterceptor } from './interceptor/auth-interceptor';
import { ToolbarModule, ToolbarComponent } from '@ceiba/toolbar';
import { NavbarModule, NavbarComponent } from '@ceiba/navbar';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ToolbarModule,
    NavbarModule
  ],
  exports: [ToolbarComponent, NavbarComponent],
  providers: [
    SecurityGuard,
    { provide: HTTP_INTERCEPTORS, useClass: TokenInterceptor, multi: true },
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true }
  ]
})
export class CoreModule { }
