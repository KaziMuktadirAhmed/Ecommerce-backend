package com.mrbin.mr_bin.repositories;

import com.mrbin.mr_bin.models.Recycler;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecyclerRepository extends MongoRepository<Recycler, String>{

}
