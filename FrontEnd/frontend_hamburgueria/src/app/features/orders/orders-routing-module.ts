import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OrdersList } from './orders-list/orders-list';

const routes: Routes = [
  {path: '', component: OrdersList}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OrdersRoutingModule { }
