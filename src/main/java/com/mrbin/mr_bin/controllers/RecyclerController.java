package com.mrbin.mr_bin.controllers;

import com.mrbin.mr_bin.models.Recycler;
import com.mrbin.mr_bin.service.RecyclerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/")
public class RecyclerController {
    @Autowired
    RecyclerService recyclerService;

    @GetMapping(value = "recyclers")
    public ResponseEntity<List<Recycler>> getAllRecyclers(){
        return new ResponseEntity<List<Recycler>>(recyclerService.getAllRecyclers(), HttpStatus.OK) ;
    }

    @PostMapping(value = "recycler/new")
    public ResponseEntity<Recycler> addRecycler(@RequestBody Recycler recycler){
        Recycler createdRecycler = recyclerService.createRecycler((recycler));
        return new ResponseEntity<>(createdRecycler, HttpStatus.CREATED);
    }

    // Retrieve a product by ID
    @GetMapping("/recycler/{id}")
    public ResponseEntity<Recycler> getRecyclerById(@PathVariable String id) {
        Optional<Recycler> product = recyclerService.getRecyclerById(id);
        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/recycler/{id}")
    public ResponseEntity<String> deleteRecyclerById(@PathVariable String id) {
        Optional<Recycler> existingRecycler = recyclerService.getRecyclerById(id);

        if (existingRecycler.isPresent()) {
            recyclerService.deleteRecyclerById(id);
            return new ResponseEntity<>("Recycler with ID " + id + " has been deleted.", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>("Recycler with ID " + id + " not found.", HttpStatus.NOT_FOUND);
        }
    }
}
