package com.ds.DS.data;

import jakarta.persistence.*;
@Entity
@Table
public class DeliveryTransitRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long transitRateId;
    @ManyToOne
    @JoinColumn(name = "carrier_id")
    private DeliveryCarriers deliveryCarriers;
    @ManyToOne
    @JoinColumn(name = "transit_id")
    private DeliveryTransit deliveryTransit;
    private Integer transitRate;
}
