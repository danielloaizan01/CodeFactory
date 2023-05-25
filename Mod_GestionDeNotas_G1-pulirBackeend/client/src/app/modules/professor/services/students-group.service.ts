import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StudentsGroupService {

  private urlEndPoint:string = environment.route;

  constructor( private http: HttpClient ) { }

  getStudentsGroup( id: number ) {
    return this.http.get(this.urlEndPoint + 'profesor/grupo/estudiantes/' + id);
  }
}
