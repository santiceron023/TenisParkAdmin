import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CanchaService } from '../../service/cancha.service';
import { Cancha } from '../../shared/Cancha';
import { markFormGroupTouched } from 'src/app/shared/utils';
import { Router } from '@angular/router';
import { MatDialog } from '@angular/material';
import { AlertDialogComponent } from 'src/app/shared/alert/alert-dialog/alert-dialog.component';
import { MSG_CREATED } from 'src/app/shared/var.const';

@Component({
  selector: 'app-cancha-crear',
  templateUrl: './cancha-crear.component.html',
  styleUrls: ['./cancha-crear.component.css']
})
export class CanchaCrearComponent implements OnInit {
  form: FormGroup;
  constructor(private canchaService:CanchaService,
    private router:Router,
    public dialog: MatDialog) {}

  ngOnInit() {
    this.form = new FormGroup({
      numeroFormCtrl: new FormControl('', Validators.required),
      administradorFormCtrl: new FormControl('', Validators.required),
      telefonoFormCtrl: new FormControl('', Validators.required)
    });
  }

  guardar(){
    if(!this.form.valid){
      markFormGroupTouched(this.form);
      return
    }

    let cancha = new Cancha(this.form.get('numeroFormCtrl').value,
    this.form.get('administradorFormCtrl').value,
    this.form.get('telefonoFormCtrl').value);

    this.canchaService.crear(cancha).subscribe((data)=>
    {
      this.dialog.open(AlertDialogComponent,{
        data: MSG_CREATED
      });
      this.canchaService.recargar.next(true);
      this.router.navigateByUrl('/cancha');
    });
    }
}
