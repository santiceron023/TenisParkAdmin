import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { ToolbarModule, ToolbarComponent } from '@ceiba/toolbar';
import { NavbarModule, NavbarComponent } from '@ceiba/navbar';
import { MatToolbarModule, MatDialogModule } from '@angular/material';
import { AlertDialogComponent } from '../shared/alert/alert-dialog/alert-dialog.component';
import { ResponseCodeInterceptor } from './interceptor/responseCode-interceptor';

@NgModule({
  
  imports: [
    CommonModule,
    ToolbarModule,
    NavbarModule,
    MatToolbarModule,
    MatDialogModule
  ],
  entryComponents: [AlertDialogComponent],
  exports: [ToolbarComponent, NavbarComponent,MatToolbarModule,MatDialogModule],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: ResponseCodeInterceptor, multi: true }
  ]
})
export class CoreModule { }
