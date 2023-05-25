import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private urlEndPoint:string = environment.route + 'Profesor/grupos/';

  constructor() { }
}
