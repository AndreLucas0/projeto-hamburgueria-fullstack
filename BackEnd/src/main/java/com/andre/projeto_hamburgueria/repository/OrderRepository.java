package com.andre.projeto_hamburgueria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.projeto_hamburgueria.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
