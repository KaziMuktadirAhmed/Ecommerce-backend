package com.mrbin.mr_bin.service;

import com.mrbin.mr_bin.models.Organization;
import com.mrbin.mr_bin.models.Recycler;
import com.mrbin.mr_bin.repositories.OrganizationRepository;
import com.mrbin.mr_bin.repositories.RecyclerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;
    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }
    public List<Organization> getAllOrganizations(){
        return organizationRepository.findAll();
    }

    public Optional<Organization> getOrganizationById(String id){
        return organizationRepository.findById(id);
    }
    public void deleteOrganizationById(String id) {
        organizationRepository.deleteById(id);
    }

}
