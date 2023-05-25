import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';
import { EnterGradesProfessorComponent } from './pages/enter-grades-professor/enter-grades-professor.component';

const routes: Routes = [
  { path: 'view-groups', component: ViewGroupsProfessorComponent },
  { path: 'enter-grades', component: EnterGradesProfessorComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProfessorRoutingModule { }
