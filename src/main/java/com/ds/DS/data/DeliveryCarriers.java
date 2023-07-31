package com.ds.DS.data;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table
public class DeliveryCarriers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrier_id")
    private Long carrierId;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    private String carrierName;
    private Time pickUpTime;
    private Time orferProcessingTime;
    private Integer lavelOfService;
}
