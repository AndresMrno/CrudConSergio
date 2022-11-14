import { TestBed } from '@angular/core/testing';

import { OcupacionesService } from './ocupaciones.service';

describe('OcupacionesService', () => {
  let service: OcupacionesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OcupacionesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
