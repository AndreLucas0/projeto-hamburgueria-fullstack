import { Component } from '@angular/core';
import { OrderInterface } from './interface/Order';
import { OrderService } from './service/order-service';

@Component({
  selector: 'app-orders-list',
  standalone: false,
  templateUrl: './orders-list.html',
  styleUrl: './orders-list.css'
})
export class OrdersList {
  
  orders: OrderInterface[] = [];

  constructor(private orderService: OrderService) {}

  ngOnInit(): void {

  }

  loadOrders() {
    this.orderService.getOrders().subscribe({
      next: data => { this.orders = data }
    });
  }
  
  getString(): string {
    return "Olá, mundo!";
  }

  handleResult(result: string) {
    console.log('Recebi do botão: ', result);
  }
}
