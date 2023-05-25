import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Router } from '@angular/router';

import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { CourseInterface } from '../interfaces/course-interface';
import { GroupInterface } from '../interfaces/group-interface';

@Injectable({
  providedIn: 'root'
})
export class GroupsService {

  private urlEndPoint:string = environment.route;


  constructor( private http: HttpClient ) { }

  getGroups( id: number ): Observable<GroupInterface[]>  { 
    return this.http.get<GroupInterface[]>(this.urlEndPoint + 'Profesor/grupos/' + id);
  }

  getGroup( id: number ): Observable<GroupInterface>  {
    return this.http.get<GroupInterface>(this.urlEndPoint + 'grupo/' + id);
  }


}
