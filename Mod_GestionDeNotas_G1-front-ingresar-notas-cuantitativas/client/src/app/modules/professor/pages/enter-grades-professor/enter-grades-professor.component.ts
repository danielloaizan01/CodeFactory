import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-enter-grades-professor',
  templateUrl: './enter-grades-professor.component.html',
  styleUrls: ['./enter-grades-professor.component.scss']
})
export class EnterGradesProfessorComponent implements OnInit {

  actividades = ["Parcial 1","Parcial 2", "Seguimiento", "Fábrica escuela"];
  notas = [4.3,5,2,2.4];
  porcentajes = [0.3,0.4,0.1,0.2];
  estudiantes = ["Samuel", "David","Oswald", "Robinson"];//TODO: Crear servicio y estructurar bien los datos.
  constructor() { }

  ngOnInit(): void {
  }

}
