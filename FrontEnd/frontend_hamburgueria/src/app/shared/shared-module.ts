import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PrimaryButton } from './components/primary-button/primary-button';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    PrimaryButton
  ],
  imports: [
    CommonModule
  ],
  exports: [
    PrimaryButton,

    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class SharedModule { }
