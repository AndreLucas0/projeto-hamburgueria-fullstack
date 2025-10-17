import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OrdersRoutingModule } from './orders-routing-module';
import { OrdersList } from './orders-list/orders-list';
import { SharedModule } from '../../shared/shared-module';


@NgModule({
  declarations: [
    OrdersList
  ],
  imports: [
    CommonModule,
    OrdersRoutingModule,
    SharedModule
  ]
})
export class OrdersModule { }
