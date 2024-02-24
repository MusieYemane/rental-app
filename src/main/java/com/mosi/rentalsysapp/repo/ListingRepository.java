package com.mosi.rentalsysapp.repo;

import com.mosi.rentalsysapp.domain.Listing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ListingRepository extends JpaRepository<Listing, Long> {

    Page<Listing> findAll(Pageable pageable);
}
