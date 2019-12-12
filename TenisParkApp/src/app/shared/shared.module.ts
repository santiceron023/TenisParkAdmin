import { NgModule, LOCALE_ID } from '@angular/core';
import { CommonModule, registerLocaleData } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

// importar locales
import localePy from '@angular/common/locales/es-PY';
import { AlertDialogComponent } from './alert/alert-dialog/alert-dialog.component';
registerLocaleData(localePy, 'es');

@NgModule({
  declarations: [AlertDialogComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  exports: [
    CommonModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  entryComponents:[AlertDialogComponent],
  providers: [ { provide: LOCALE_ID, useValue: 'es' } ]
})
export class SharedModule { }
