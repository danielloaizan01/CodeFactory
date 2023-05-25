import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs/operators';
import { StudentsGroupService } from 'src/app/modules/professor/services/students-group.service';

@Component({
  selector: 'app-info-students',
  templateUrl: './info-students.component.html',
  styleUrls: ['./info-students.component.scss']
})
export class InfoStudentsComponent implements OnInit {

  public id = 0;
  public students: any  = [];

  constructor(
    private studentsGroupSvc: StudentsGroupService,
    private activateRoute: ActivatedRoute
    ) {

    const student = this.activateRoute.params.pipe(
      switchMap(
        params => {
          this.id = params['id']
          return this.studentsGroupSvc.getStudentsGroup(params['id'])
        }
      )
    );

    student.subscribe(
      (data) => {
        console.log(data)
        this.students = data
      }
    );
   }

  ngOnInit(): void {
  }

}
