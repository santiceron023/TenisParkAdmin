import { Component, OnInit } from '@angular/core';
import { CanchaService } from '../../service/cancha.service';
import { Cancha } from '../../shared/Cancha';
import { MatTableDataSource } from '@angular/material';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cancha',
  templateUrl: './cancha.component.html',
  styleUrls: ['./cancha.component.css']
})
export class CanchaComponent implements OnInit {
  
  displayedColumns = ['id', 'administrador', 'telefono'];
dataSource:MatTableDataSource<Cancha>
  constructor(private router:Router,
    private service:CanchaService) { }

  ngOnInit() {
    this.setDatadable();
    this.service.recargar.subscribe(data=>{
      if(data){
        this.setDatadable();
        this.service.recargar.next(false);
      }
    })
  }


  setDatadable() {
    this.service.listar().subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
    });
  }

  agregar() {
    this.router.navigateByUrl('/cancha/crear');
  }
}
