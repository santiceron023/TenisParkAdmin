import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReservaListarComponent } from './reserva-listar.component';

describe('ReservaListarComponent', () => {
  let component: ReservaListarComponent;
  let fixture: ComponentFixture<ReservaListarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReservaListarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReservaListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
