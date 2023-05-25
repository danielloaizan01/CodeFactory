import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnterGradesProfessorComponent } from './enter-grades-professor.component';

describe('EnterGradesProfessorComponent', () => {
  let component: EnterGradesProfessorComponent;
  let fixture: ComponentFixture<EnterGradesProfessorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnterGradesProfessorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnterGradesProfessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
