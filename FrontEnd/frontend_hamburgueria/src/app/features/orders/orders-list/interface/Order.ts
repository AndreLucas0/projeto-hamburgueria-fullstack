import { OrderItemInterface } from "./OrderItem"

export interface OrderInterface {
    id : number,
    createdAt : string,
    updatedAt : string,
    status : string,
    totalAmount : number,
    user : string,
    items : OrderItemInterface[]
}