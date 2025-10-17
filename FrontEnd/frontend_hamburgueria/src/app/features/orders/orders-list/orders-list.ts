import { Component } from '@angular/core';

@Component({
  selector: 'app-orders-list',
  standalone: false,
  templateUrl: './orders-list.html',
  styleUrl: './orders-list.css'
})
export class OrdersList {
  getString(): string {
    return "Olá, mundo!";
  }

  handleResult(result: string) {
    console.log('Recebi do botão: ', result);
  }
}
