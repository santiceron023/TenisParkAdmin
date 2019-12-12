import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReservaCrearComponent } from './reserva-crear.component';

describe('ReservaCrearComponent', () => {
  let component: ReservaCrearComponent;
  let fixture: ComponentFixture<ReservaCrearComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReservaCrearComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReservaCrearComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
