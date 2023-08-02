package com.ds.DS.data;

import jakarta.persistence.*;

@Entity
@Table
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String address;
    private String city;
    private String state;
    private Long postalCode;
    private String Country;
}
