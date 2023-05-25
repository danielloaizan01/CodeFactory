// This is the shared module, it will be imported in the app.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//routing
import { SharedRoutingModule } from './shared-routing.module';

//components
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';


@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    SharedRoutingModule
  ],
  exports: [
    HeaderComponent,
    FooterComponent
  ]
})
export class SharedModule { }
