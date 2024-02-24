package com.mosi.rentalsysapp.service;

import com.mosi.rentalsysapp.domain.Listing;
import com.mosi.rentalsysapp.repo.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepository;

    public Page<Listing> getAllListings(Pageable pageable) {
        return listingRepository.findAll(pageable);
    }
    public Listing getListingById(Long id) {
        return listingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Listing not found with id " + id));
    }


    public Listing saveListing(Listing listing) {

        return listingRepository.save(listing);
    }
}
