import { TestBed } from '@angular/core/testing';

import { ReservaService } from './reserva.service';

describe('ResrvaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReservaService = TestBed.get(ReservaService);
    expect(service).toBeTruthy();
  });
});
