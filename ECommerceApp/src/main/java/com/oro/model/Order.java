package com.oro.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Order {
    @Id
    private String id;
    private String userId;
    private List<ProductItem> products;
    private double totalPrice;
    private String status;
}
