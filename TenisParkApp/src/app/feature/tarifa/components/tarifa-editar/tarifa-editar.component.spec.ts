import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TarifaEditarComponent } from './tarifa-editar.component';

describe('TarifaEditarComponent', () => {
  let component: TarifaEditarComponent;
  let fixture: ComponentFixture<TarifaEditarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TarifaEditarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TarifaEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
