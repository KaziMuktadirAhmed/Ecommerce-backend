package com.mrbin.mr_bin.repositories;

import com.mrbin.mr_bin.models.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends MongoRepository<Organization, String> {
}
