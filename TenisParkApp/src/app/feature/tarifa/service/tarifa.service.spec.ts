import { TestBed } from '@angular/core/testing';

import { TarifaService } from './tarifa.service';

describe('TarifaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TarifaService = TestBed.get(TarifaService);
    expect(service).toBeTruthy();
  });
});
