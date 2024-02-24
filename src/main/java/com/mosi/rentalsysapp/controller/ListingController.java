package com.mosi.rentalsysapp.controller;

import com.mosi.rentalsysapp.domain.Listing;
import com.mosi.rentalsysapp.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/listings")
public class ListingController {
    @Autowired
    private ListingService listingService;

    @GetMapping
    public ResponseEntity<Page<Listing>> getAllListings(Pageable pageable) {
        Page<Listing> allListings = listingService.getAllListings(pageable);
        return ResponseEntity.ok(allListings);
    }
    @GetMapping(value= "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Listing> getListing(@PathVariable Long id) {
        Listing listing = listingService.getListingById(id);
        return ResponseEntity.ok(listing);
    }

    @PostMapping( produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Listing> createListing(@RequestBody Listing listing) {
        // Handle image saving here
        Listing savedListing = listingService.saveListing(listing);
        return ResponseEntity.ok(savedListing);
    }
}
