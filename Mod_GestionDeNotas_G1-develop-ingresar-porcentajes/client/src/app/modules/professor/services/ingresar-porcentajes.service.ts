import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class IngresarPorcentajesService {


  private urlEndPoint:string =  environment.route + "Actividades"
  constructor(private http: HttpClient) { }

  //TODO: CAMBIAR LOS ANY POR UNA INTERFACE DE LOS DATOS QUE LLEGAN
  IngresarPorcentaje(body: any):Observable<any> {
    return this.http.post(this.urlEndPoint, body);
  }
}
