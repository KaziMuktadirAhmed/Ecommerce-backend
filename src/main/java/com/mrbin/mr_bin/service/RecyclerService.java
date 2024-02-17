package com.mrbin.mr_bin.service;

import com.mrbin.mr_bin.models.Recycler;
import com.mrbin.mr_bin.repositories.RecyclerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecyclerService {
    @Autowired
    private RecyclerRepository recyclerRepository;
    public Recycler createRecycler(Recycler recycler) {
        return recyclerRepository.save(recycler);
    }
    public List<Recycler> getAllRecyclers(){
        return recyclerRepository.findAll();
    }

    public Optional<Recycler> getRecyclerById(String id){
        return recyclerRepository.findById(id);
    }
    public void deleteRecyclerById(String id) {
        recyclerRepository.deleteById(id);
    }


}