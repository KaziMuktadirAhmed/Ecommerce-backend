package com.mrbin.mr_bin.repositories;

import com.mrbin.mr_bin.models.Donation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends MongoRepository<Donation, String> {
    public List<Donation> findAllByUserId(String userId);
}
