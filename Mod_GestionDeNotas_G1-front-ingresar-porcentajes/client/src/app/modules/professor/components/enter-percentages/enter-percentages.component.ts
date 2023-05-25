import { Component, OnInit } from '@angular/core';

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

  constructor() {}

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
