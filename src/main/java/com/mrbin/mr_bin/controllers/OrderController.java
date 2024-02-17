package com.mrbin.mr_bin.controllers;

import com.mrbin.mr_bin.models.Order;
import com.mrbin.mr_bin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/api/v1")
public class OrderController {
    @Autowired
    private OrderService orderService;



    // Place a new order
    @PostMapping("/me/order/new")
    public ResponseEntity<Order> placeOrder(@RequestBody OrderDTO orderDTO) {
        // Implement logic to place a new order
        // Use orderService to process the order
        // Return an appropriate ResponseEntity
    }

    // Get user-specific orders
    @GetMapping("/me/order")
    public ResponseEntity<List<Order>> getUserOrder() {
        // Implement logic to retrieve user orders
        // Use orderService to fetch user orders
        // Return an appropriate ResponseEntity
    }

    // Get all orders
    @GetMapping("/admin/recycle/order")
    public ResponseEntity<List<Order>> getOrders() {
        // Implement logic to retrieve all orders
        // Use orderService to fetch orders
        // Return an appropriate ResponseEntity
    }

    // Update order status
    @PutMapping("/admin/recycle/order/{id}/{status}")
    public ResponseEntity<?> updateStatus(
            @PathVariable String id,
            @PathVariable String status,
//            @RequestBody StatusUpdateDTO statusUpdateDTO
    ) {
        // Implement logic to update the status of an order
        // Use orderService to update the status
        // Return an appropriate ResponseEntity
    }
}
