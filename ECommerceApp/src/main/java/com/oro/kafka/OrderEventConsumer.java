package com.oro.kafka;

import com.oro.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class OrderEventConsumer {

    private final Logger logger = LoggerFactory.getLogger(OrderEventConsumer.class);

    @KafkaListener(topics = "order-events", groupId = "order-group")
    public void listenOrderEvent(Order order) {
        logger.info("Received order event for order ID: " + order.getId());
        System.out.println("Received order event: " + order);
    }
}
