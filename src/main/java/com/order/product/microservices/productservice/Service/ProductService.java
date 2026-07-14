package com.order.product.microservices.productservice.Service;

import com.order.product.microservices.productservice.controller.ProductResponse;
import com.order.product.microservices.productservice.controller.dto.ProductRequest;
import com.order.product.microservices.productservice.model.Product;
import com.order.product.microservices.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(ProductRequest request)
    {
        if(request!=null)
        {
            Product product = Product.builder()
                    .name(request.name())
                    .description(request.description())
                    .price(request.price()).build();
            productRepository.save(product);
            log.info("Product saved successfully");
            return new ProductResponse(product.getName(),product.getDescription(),product.getPrice());
        }
       return null;
    }
    
    public List<ProductResponse> getProducts()
    {
        log.info("Product being fetched successfully");
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(product -> new ProductResponse(product.getName(),product.getDescription(),product.getPrice()))
                .toList();
    }
}
