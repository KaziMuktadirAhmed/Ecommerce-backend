package com.mrbin.mr_bin.controllers;

import com.mrbin.mr_bin.models.Product;
import com.mrbin.mr_bin.models.Recycler;
import com.mrbin.mr_bin.models.utils.Bid;
import com.mrbin.mr_bin.models.utils.Comment;
import com.mrbin.mr_bin.service.ProductService;
import com.mrbin.mr_bin.service.RecyclerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    ProductService productService;

    // Add a new product
    @PostMapping("/product/new")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

    // Get all products
    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    // Get user-specific products
    @GetMapping("/me/product")
    public ResponseEntity<List<Product>> getUserProducts() {
//        User Authentication
        String userId = null;
        return new ResponseEntity<>(productService.getAllUserProductById(userId), HttpStatus.OK);
    }

    // Get a single product by ID
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable String id) {
        return new ResponseEntity<>(productService.getProductById(id) , HttpStatus.OK);
    }

    // Delete a product by ID
    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id) {
        // Implement logic to delete a product by ID
        // Use productService to perform the deletion
        // Return an appropriate ResponseEntity
    }

    // Verify a product by ID
    @PutMapping("/product/{id}/verify")
    public ResponseEntity<?> verifyProduct(@PathVariable String id) {
        // Implement logic to verify a product by ID
        // Use productService to perform the verification
        // Return an appropriate ResponseEntity
    }

    // Place a bid on a product
    @PutMapping("/product/{id}/bid/new")
    public ResponseEntity<?> createBid(@PathVariable String id, @RequestBody Bid bid) {
        // Implement logic to place a new bid on a product
        // Use productService to process the bid
        // Return an appropriate ResponseEntity
    }

    // Get bids for a product
    @GetMapping("/product/{id}/bid")
    public ResponseEntity<?> getBid(@PathVariable String id) {
        // Implement logic to retrieve bids for a product
        // Use productService to fetch the bids
        // Return an appropriate ResponseEntity
    }

    // Delete a bid for a product by bid ID
    @DeleteMapping("/product/{id}/bid/{bidId}")
    public ResponseEntity<?> rejectBid(@PathVariable String id, @PathVariable String bidId) {
        // Implement logic to delete a bid for a product by bid ID
        // Use productService to perform the deletion
        // Return an appropriate ResponseEntity
    }

    // Edit a bid for a product by bid ID
    @PutMapping("/product/{id}/bid/{bidId}/edit")
    public ResponseEntity<?> editBid(@PathVariable String id, @PathVariable String bidId, @RequestBody Bid bidDTO) {
        // Implement logic to edit a bid for a product by bid ID
        // Use productService to perform the edit
        // Return an appropriate ResponseEntity
    }

    // Accept a bid for a product
    @PutMapping("/product/{id}/{buyerId}")
    public ResponseEntity<?> acceptBid(@PathVariable String id, @PathVariable String buyerId) {
        // Implement logic to accept a bid for a product
        // Use productService to perform the acceptance
        // Return an appropriate ResponseEntity
    }

    // Add a comment to a product
    @PutMapping("/product/{id}/comment/new")
    public ResponseEntity<?> addComment(@PathVariable String id, @RequestBody Comment commentDTO) {
        // Implement logic to add a new comment to a product
        // Use productService to process the comment addition
        // Return an appropriate ResponseEntity
    }

    // Get comments for a product
    @GetMapping("/product/{id}/comment")
    public ResponseEntity<?> getComment(@PathVariable String id) {
        // Implement logic to retrieve comments for a product
        // Use productService to fetch the comments
        // Return an appropriate ResponseEntity
    }

    // Update product details
    @PutMapping("/product/{id}/edit")
    public ResponseEntity<?> updateProduct(@PathVariable String id, @RequestBody Product product) {
        // Implement logic to update the details of a product
        // Use productService to perform the update
        // Return an appropriate ResponseEntity
    }
}

}
