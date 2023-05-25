import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewStudentsGroupComponent } from './view-students-group.component';

describe('ViewStudentsGroupComponent', () => {
  let component: ViewStudentsGroupComponent;
  let fixture: ComponentFixture<ViewStudentsGroupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewStudentsGroupComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewStudentsGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
