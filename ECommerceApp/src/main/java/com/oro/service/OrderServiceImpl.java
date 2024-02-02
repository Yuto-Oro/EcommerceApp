package com.oro.service;

import com.oro.kafka.OrderEventProducer;
import com.oro.model.Order;
import com.oro.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderEventProducer orderEventProducer;

    @Override
    public Order createOrder(Order order) {
        Order savedOrder = orderRepository.save(order);
        orderEventProducer.sendOrderEvent(savedOrder);
        return savedOrder;
    }

    @Override
    public Order updateOrderStatus(String orderId, String status) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        return orderRepository.save(order);
    }
}
