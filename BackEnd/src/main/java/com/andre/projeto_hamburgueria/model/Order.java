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
    @Column(nullable = false)
    @NotBlank(message = "Status can not be blank.")
    private String status; //substituir por OrderStatus
    @Column(nullable = false)
    @NotBlank(message = "Total amount can not be blank.")
    private Double totalAmount;
    private String user; //substituir por User
    @Column(nullable = false)
    @NotBlank(message = "Items can not be blank.")
    private List<Long> items; //substituir por OrderItem

}
