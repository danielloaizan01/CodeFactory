import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnterPercentagesComponent } from './enter-percentages.component';

describe('EnterPercentagesComponent', () => {
  let component: EnterPercentagesComponent;
  let fixture: ComponentFixture<EnterPercentagesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnterPercentagesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnterPercentagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
