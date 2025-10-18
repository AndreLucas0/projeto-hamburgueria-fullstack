import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { OrderInterface } from '../interface/Order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  
  constructor(private http: HttpClient) {}

  getOrders() : Observable<OrderInterface[]> {
    return this.http.get<OrderInterface[]>("http://localhost:8080/orders");
  }

  saveOrder(order: OrderInterface) {
    return this.http.post<OrderInterface>("http://localhost:8080/orders", order);
  }

  getOrderById(order: OrderInterface) {
    return this.http.get<OrderInterface>(`http://localhost:8080/orders/${order.id}`);
  }

  deleteOrder(order: OrderInterface) {
    return this.http.delete<void>(`http://localhost:8080/orders/${order.id}`);
  }
}
