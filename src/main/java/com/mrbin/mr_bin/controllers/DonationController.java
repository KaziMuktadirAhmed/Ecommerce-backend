package com.mrbin.mr_bin.controllers;


import com.mrbin.mr_bin.models.Donation;
import com.mrbin.mr_bin.service.DonationService;
import com.mrbin.mr_bin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class DonationController {

    @Autowired
    DonationService donationService;

    @Autowired
    ProductService productService;

    @PostMapping("/me/donation/new")
    public ResponseEntity<Donation> placeDonation(@RequestBody Donation donation) {
        // Set the user ID from the authenticated user
//        donation.setUserId(authenticatedUserId);

        // Save the donation to MongoDB
        Donation createdDonation = donationService.createDonation(donation);

        // Update the product type
        productService.updateProductType(donation.getProductId(), donation.getOrderType());

        return new ResponseEntity<>(createdDonation, HttpStatus.OK);
    }

    @GetMapping("/me/donation")
    public ResponseEntity<List<Donation>> getUserDonation() {

        String authenticatedUserId = null;
//         Need Authenticated User Id
        List<Donation> donations = donationService.getDonationsByUserid(authenticatedUserId);
        return new ResponseEntity<>(donations, HttpStatus.OK);
    }


    @GetMapping("/admin/organization/donation")
    public ResponseEntity<List<Donation>> getDonations() {
        List<Donation> donations = donationService.getAllDonations();
        return new ResponseEntity<>(donations, HttpStatus.OK);
    }

    @PutMapping("/admin/organization/donation/{id}/{status}")
    public ResponseEntity<?> updateStatus(
            @PathVariable String id,
            @PathVariable String status) {
        Optional<Donation> donationOptional = donationService.getDonationById(id);

        if (donationOptional.isPresent()) {
            Donation donation =  donationOptional.get();
            donation.setStatus(status);
            donationService.updateDonation(Optional.of(donation));
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
