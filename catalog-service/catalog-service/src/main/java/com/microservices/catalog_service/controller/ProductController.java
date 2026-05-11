package com.microservices.catalog_service.controller;

import com.microservices.catalog_service.entity.Product;
import com.microservices.catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }
}
