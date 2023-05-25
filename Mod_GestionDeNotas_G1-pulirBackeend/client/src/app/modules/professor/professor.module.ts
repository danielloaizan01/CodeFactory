import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfessorRoutingModule } from './professor-routing.module';
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';
import { ViewStudentsGroupComponent } from './pages/view-students-group/view-students-group.component';
import { InfoGroupComponent } from './pages/view-students-group/pages/info-group/info-group.component';
import { InfoStudentsComponent } from './pages/view-students-group/pages/info-students/info-students.component';



@NgModule({
  declarations: [
    ViewGroupsProfessorComponent,
    ViewStudentsGroupComponent,
    InfoGroupComponent,
    InfoStudentsComponent
  ],
  imports: [
    CommonModule,
    ProfessorRoutingModule,
  ]
})
export class ProfessorModule { }
