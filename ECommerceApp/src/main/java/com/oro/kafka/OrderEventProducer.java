package com.oro.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {
    private static final String TOPIC = "order-events";
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void sendOrderEvent(Object orderEvent) {
        kafkaTemplate.send(TOPIC, orderEvent);
    }
}
