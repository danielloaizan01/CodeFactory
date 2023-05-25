import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProfessorService {

  private urlEndPoint:string = environment.route + 'profesor/';

  constructor( private http: HttpClient ) { }

  getProfessor( id: number ) {
    return this.http.get(this.urlEndPoint + id);
  }
}
