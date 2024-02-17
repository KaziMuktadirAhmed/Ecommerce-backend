package com.mrbin.mr_bin.service;

import com.mrbin.mr_bin.models.Product;
import com.mrbin.mr_bin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    // Create a new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Retrieve all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Retrieve a product by ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }
    public List<Product> getAllUserProductById(String userId) {
        return productRepository.findAllByUserId(userId);
    }

    // Update a product
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete a product by ID
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }

    public void updateProductType(String productId, String orderType) {
    }
}
