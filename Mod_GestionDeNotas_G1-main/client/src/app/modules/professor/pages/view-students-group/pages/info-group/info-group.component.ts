import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs';
import { IProfessor } from 'src/app/modules/professor/interfaces/professor-interface';
import { GroupsService } from 'src/app/modules/professor/services/groups.service';
import { ProfessorService } from 'src/app/modules/professor/services/professor.service';

@Component({
  selector: 'app-info-group',
  templateUrl: './info-group.component.html',
  styleUrls: ['./info-group.component.scss']
})
export class InfoGroupComponent {

  public id = 0;
  public courses: any[] = [];
  public group: any= {};
  public professor: any = {};

  constructor(
    private activateRoute: ActivatedRoute, 
    
    private groupsSvc: GroupsService,
    private professorSvc: ProfessorService
  ) {

    const group = this.activateRoute.params.pipe(
      switchMap(
        params => {
          this.id = params['id']
          return this.groupsSvc.getGroup(params['id'])
        }
      )
    );
    group.subscribe(
      (data) => {
        //console.log(data)
        this.group = data
      }
    );

    this.professorSvc.getProfessor(100004).subscribe((resp) => {
      console.log(resp);
      this.professor = resp;
    });
   }


}
