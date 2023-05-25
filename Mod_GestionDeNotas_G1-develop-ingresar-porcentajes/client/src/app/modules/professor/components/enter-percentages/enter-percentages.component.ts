import { Component, OnInit } from '@angular/core';
import { IngresarPorcentajesService } from '../../services/ingresar-porcentajes.service';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-enter-percentages',
  templateUrl: './enter-percentages.component.html',
  styleUrls: ['./enter-percentages.component.scss'],
})
export class EnterPercentagesComponent implements OnInit {
  public activities: any[] = [
    { name: 'Proyecto Final', percentage: 40 },
    { name: 'Examen Final', percentage: 30 },
    { name: 'Tareas', percentage: 30 },
  ];
  public fullPercentage: number = 0;

  public form = this.fb.group({
    descripcion: [[Validators.required]],
    porcentaje: [[Validators.required]]
  })

  constructor(
    private ingresarPorcentajeSvc: IngresarPorcentajesService, 
    private fb: FormBuilder 
    ) {}

  ngOnInit(): void {
    this.updatePercentage();
  }

  public updatePercentage() {
    this.fullPercentage = 0;
    this.activities.forEach((activity) => {
      this.fullPercentage += activity.percentage;
    });
  }

  public addActivity() {
    this.activities.push({ name: '', percentage: 0 });
  }

  public deleteActivity(index: number) {
    this.activities.splice(index, 1);
    this.updatePercentage();
  }
}
