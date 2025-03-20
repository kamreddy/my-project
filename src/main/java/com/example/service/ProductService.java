package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    
    public Optional<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}