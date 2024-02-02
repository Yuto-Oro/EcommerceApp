package com.oro.repository;

import com.oro.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository  extends MongoRepository<Order, String> {
}
