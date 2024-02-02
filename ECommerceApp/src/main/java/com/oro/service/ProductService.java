package com.oro.service;

import com.oro.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product);
    Optional<Product> getProductById(String id);
    List<Product> getAllProducts();
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
}
