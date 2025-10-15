package com.andre.projeto_hamburgueria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.andre.projeto_hamburgueria.model.Order;
import com.andre.projeto_hamburgueria.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public Order getById(long id) {
        Order order = orderRepository.findById(id)
              .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found."));
              
        return order;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order save(Order order) {
        Order orderSaved = orderRepository.save(order);
        return orderSaved;
    }

    public void deleteById(long id) {
        Order order = this.getById(id);
        orderRepository.delete(order);
    }

    public void update(long id, Order orderUpdate) {
        Order order = this.getById(id);
    }
}
