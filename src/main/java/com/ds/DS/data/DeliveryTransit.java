package com.ds.DS.data;

import jakarta.persistence.*;

@Entity
@Table
public class DeliveryTransit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transit_id")
    private Long transitId;
    @ManyToOne
    @JoinColumn(name = "carrier_id")
    private DeliveryCarriers deliveryCarriers;
    private Integer fromPincode;
    private Integer toPincode;
    private Long transitLength;
}
