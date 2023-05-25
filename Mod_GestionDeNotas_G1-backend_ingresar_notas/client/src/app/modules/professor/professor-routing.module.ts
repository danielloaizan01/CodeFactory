import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { ViewGroupsProfessorComponent } from './pages/view-groups-professor/view-groups-professor.component';

const routes: Routes = [
  { path: 'view-groups/:id', component: ViewGroupsProfessorComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProfessorRoutingModule { }
