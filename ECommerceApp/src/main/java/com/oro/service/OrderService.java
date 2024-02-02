package com.oro.service;

import com.oro.model.Order;

public interface OrderService {
    Order createOrder(Order order);
    Order updateOrderStatus(String orderId, String status);
}
