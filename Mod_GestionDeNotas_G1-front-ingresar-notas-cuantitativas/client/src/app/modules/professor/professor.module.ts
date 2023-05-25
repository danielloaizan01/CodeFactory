import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfessorRoutingModule } from './professor-routing.module';
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';
import { EnterGradesProfessorComponent } from './pages/enter-grades-professor/enter-grades-professor.component';



@NgModule({
  declarations: [
    ViewGroupsProfessorComponent,
    EnterGradesProfessorComponent
  ],
  imports: [
    CommonModule,
    ProfessorRoutingModule,
    
  ]
})
export class ProfessorModule { }
