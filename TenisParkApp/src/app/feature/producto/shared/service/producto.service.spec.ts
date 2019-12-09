import { TestBed } from '@angular/core/testing';

import { ProductoService } from './producto.service';
import { HttpClientModule } from '@angular/common/http';

describe('ProductoService', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [
      HttpClientModule
    ],
  }));

  it('should be created', () => {
    const service: ProductoService = TestBed.get(ProductoService);
    expect(service).toBeTruthy();
  });
});
