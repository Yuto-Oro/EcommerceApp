package com.oro.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;
}
