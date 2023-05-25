import { Component } from '@angular/core';

// RxJ

// Services
import { GroupsService } from '../../services/groups.service';
import { CourseInterface } from '../../interfaces/course-interface';
import { GroupInterface } from '../../interfaces/group-interface';
import { ActivatedRoute, Router } from '@angular/router';
import { switchMap } from 'rxjs';

@Component({
  selector: 'app-view-groups-professor',
  templateUrl: './view-groups-professor.component.html',
  styleUrls: ['./view-groups-professor.component.scss'],
})
export class ViewGroupsProfessorComponent {
  public id: number | string = 0;
  public courses: any[] = [];
  public groups: any[] = [];

  constructor(
    private groupsSvc: GroupsService,
    private activateRoute: ActivatedRoute,
    private router: Router,
    ) {
    this.groupsSvc.getGroups(100004).subscribe((resp) => {
      console.log(resp);
      this.courses = resp;
    });
  } 

  searchGroups(course: any) {
    this.groups = course['grupos'];
    console.log(this.groups)
  }

  navegateToGroup(id: number) {
    this.router.navigate([
      '/professor/group/' + id
    ]);
  }
}
