import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';
import { ViewStudentsGroupComponent } from './pages/view-students-group/view-students-group.component';

const routes: Routes = [
  { path: 'view-groups', component: ViewGroupsProfessorComponent },
  { path: 'group/:id', component: ViewStudentsGroupComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProfessorRoutingModule { }
