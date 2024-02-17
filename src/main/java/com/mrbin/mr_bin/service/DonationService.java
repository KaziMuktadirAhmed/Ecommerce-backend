package com.mrbin.mr_bin.service;

import com.mrbin.mr_bin.models.Donation;
import com.mrbin.mr_bin.repositories.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

@Service
public class DonationService {
    @Autowired
    DonationRepository donationRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Donation createDonation(Donation donation){
        return donationRepository.save(donation);
    }


    public List<Donation> getDonationsByUserid(String userId){
        return donationRepository.findAllByUserId(userId);
    }

    public Optional<Donation> getDonationById(String id) {
        return donationRepository.findById(id);
    }

    public void updateDonation(Optional<Donation> donation) {

    }
    public void updateDonationStatus(String donationId, String newStatus) {
//        await Donation.updateOne(
//                { _id: req.params.id },
//        { $set: { status : req.params.status } }
//    );
//        res.status(200).json({
//                success: true,
//    });


        // Create an update query to set the new status
//        Query updateQuery = new Query(Criteria.where("_id").is(donationId));
//        Update update = Update.update("status", newStatus);
//
//        // Use the MongoTemplate to perform the update
//        mongoTemplate.updateFirst(updateQuery, update, Donation.class);

        // You can add error handling and validation here
    }

}
