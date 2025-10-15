package com.andre.projeto_hamburgueria.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.andre.projeto_hamburgueria.model.Order;
import com.andre.projeto_hamburgueria.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable long id) {
        Order order = orderService.getById(id);
        return ResponseEntity.ok(order);
    }

    @PostMapping
    public ResponseEntity<Order> save(@Validated @RequestBody Order order) {
        order = orderService.save(order);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(order.getId())
                .toUri();

        return ResponseEntity.created(location).body(order);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeOrder(@PathVariable long id) {
        orderService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
