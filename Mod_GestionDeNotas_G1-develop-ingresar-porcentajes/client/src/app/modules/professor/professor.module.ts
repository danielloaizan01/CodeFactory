import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { ProfessorRoutingModule } from './professor-routing.module';
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';
import { EnterPercentagesComponent } from './components/enter-percentages/enter-percentages.component';



@NgModule({
  declarations: [
    ViewGroupsProfessorComponent,
    EnterPercentagesComponent
  ],
  imports: [
    CommonModule,
    ProfessorRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class ProfessorModule { }
