package com.ds.DS.data;

import jakarta.persistence.*;

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "transit_id")
    private DeliveryTransit deliveryTransit;
    private String paymentMethod;
    private Integer paymentAmount;
    private String paymentStatus;
}
