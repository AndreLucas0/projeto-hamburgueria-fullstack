``` mermaid
classDiagram
    class Order {
        -id: Long
        -createdAt: LocalDateTime
        -status: OrderStatus
        -customer: String
        -attendant: User
        -items: List&lt;OrderItem&gt;
        -totalAmount: Double;
        
        +Order(): Order
        +getters()
        +setters()
        +addItem(item: OrderItem): void
        +removeItem(item: OrderItem): void
        +calculateTotal(): void
        +updateStatus(status: OrderStatus): void
        +finalizeOrder(): void
        +cancelOrder(): void
    }

    class User {
        -id: Long
        -name: String
        -role: UserRole
    }

    class OrderItem {
        -id: Long
        -product: Product
        -quantity: Integer
        -subtotal: Double
        +calculateSubtotal(): void
    }

    class Product {
        -id: Long
        -name: String
        -price: Double
        -category: Category
        -description: String
    }

    class Category {
        -id: Long
        -name: String
    }

    class OrderStatus {
        <<enumeration>>
        RECEBIDO
        EM_PREPARACAO
        PRONTO
        ENTREGUE
        CANCELADO
    }
```