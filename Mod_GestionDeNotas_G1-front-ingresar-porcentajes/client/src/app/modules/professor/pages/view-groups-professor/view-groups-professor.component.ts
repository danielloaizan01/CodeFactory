import { Component } from '@angular/core';

// RxJ

// Services
import { GroupsService } from '../../services/groups.service';
import { CourseInterface } from '../../interfaces/course-interface';
import { GroupInterface } from '../../interfaces/group-interface';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs';

@Component({
  selector: 'app-view-groups-professor',
  templateUrl: './view-groups-professor.component.html',
  styleUrls: ['./view-groups-professor.component.scss'],
})
export class ViewGroupsProfessorComponent {
  public id: number | string = 0;
  public cursos: any[] = [];
  public grupos: any[] = [];

  constructor(
    private groupsSvc: GroupsService,
    private activateRoute: ActivatedRoute
    ) {
    this.groupsSvc.getGroups(100008).subscribe((resp) => {
      console.log(resp);
      this.cursos = resp;
    });
  } 

  buscar(curso: any) {
    this.grupos = curso['grupos'];
    console.log(this.grupos)
  }
}
