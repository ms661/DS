package com.ds.DS.data;

import jakarta.persistence.*;

@Entity
@Table
public class StoreAddress {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "address_id")
        private Long addressId;
        private String city;
        private String state;
        private Long postal_code;
        private String Country;

    }
