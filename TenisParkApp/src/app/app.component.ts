import { Component } from '@angular/core';
import { Item } from '@ceiba/navbar';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app-base';
  public elementos: Item[] = [
    { url: '/home', nombre: 'home' },
    { url: '/producto', nombre: 'Tarifas' },
    { url: '/producto', nombre: 'Reservas' }    
  ];

  
}
