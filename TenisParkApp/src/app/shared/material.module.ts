import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material'
import { MAT_DATE_LOCALE } from '@angular/material/core'

@NgModule({
  declarations: [],
  imports: [
    MatToolbarModule    
  ],
  //para el padre module
  exports: [
    MatToolbarModule
  ],
  providers: [
    { provide: MAT_DATE_LOCALE, useValue: 'es-ES' }
  ]
})
export class MaterialModule { }
