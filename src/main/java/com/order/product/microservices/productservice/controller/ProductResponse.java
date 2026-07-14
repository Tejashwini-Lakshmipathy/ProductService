package com.order.product.microservices.productservice.controller;

import java.math.BigDecimal;

public record ProductResponse(String name, String description, BigDecimal price) {
}
