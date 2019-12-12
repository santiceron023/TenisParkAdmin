import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CanchaCrearComponent } from './cancha-crear.component';

describe('CanchaCrearComponent', () => {
  let component: CanchaCrearComponent;
  let fixture: ComponentFixture<CanchaCrearComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CanchaCrearComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CanchaCrearComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
