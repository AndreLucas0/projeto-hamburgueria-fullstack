package com.andre.projeto_hamburgueria.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBL_ORDER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Column(nullable = false)
    @NotBlank(message = "Status can not be blank.")
    private String status; //substituir por OrderStatus
    @Column(nullable = false)
    @NotNull(message = "Total amount can not be empty.")
    private Double totalAmount;
    @Column(name = "user_id")
    private String user; //substituir por User
    @Column(nullable = false)
    @NotNull(message = "Items can not be null.")
    private List<Long> items; //substituir por OrderItem

}
