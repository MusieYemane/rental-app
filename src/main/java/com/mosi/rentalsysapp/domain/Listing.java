package com.mosi.rentalsysapp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Setter @Getter
@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double price;
    private int bedrooms;
    private String location;

    @Temporal(TemporalType.DATE)
    private Date availableDate;
    private String phone;
    private List<String> images;

    // Getters and setters
}
