import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Contrats } from './contrats';

describe('Contrats', () => {
  let component: Contrats;
  let fixture: ComponentFixture<Contrats>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Contrats],
    }).compileComponents();

    fixture = TestBed.createComponent(Contrats);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
