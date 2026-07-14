package com.order.product.microservices.productservice.repository;

import com.order.product.microservices.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product ,String> {
}
