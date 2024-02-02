package com.oro.controller;

import com.oro.model.Order;
import com.oro.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private  final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createOrder = orderService.createOrder(order);
        return ResponseEntity.ok(createOrder);
    }

    @PutMapping("/{orderId}/status/{status}")
    public ResponseEntity<Order>
    updateOrderStatus(@PathVariable String orderId, @PathVariable String status) {
        Order updatedOrder = orderService.updateOrderStatus(orderId, status);
        return ResponseEntity.ok(updatedOrder);
    }
}
