import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewGroupsProfessorComponent } from './view-groups-professor.component';

describe('ViewGroupsProfessorComponent', () => {
  let component: ViewGroupsProfessorComponent;
  let fixture: ComponentFixture<ViewGroupsProfessorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewGroupsProfessorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewGroupsProfessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
