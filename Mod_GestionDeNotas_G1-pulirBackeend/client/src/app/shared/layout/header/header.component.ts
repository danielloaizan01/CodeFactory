import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs/operators';
import { ProfessorService } from 'src/app/modules/professor/services/professor.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
})
export class HeaderComponent implements OnInit {
  public professor: any = {};
  id: any = 0;

  constructor(
    private professorSvc: ProfessorService,
    private activateRoute: ActivatedRoute
  ) {
    const PROFESSOR = this.activateRoute.params.pipe(
      switchMap(
        params => {
          this.id = params['id']
          return this.professorSvc.getProfessor(params['id'])
        }
      )
    );
    
    PROFESSOR.subscribe(
      (data) => {
        console.log(data)
        this.professor = data
      }
    );

  }

  ngOnInit(): void {}
}
