package com.ds.DS.Delivery_D;

import jakarta.persistence.*;

@Entity
@Table
public class Store_t {
    @Id
    @SequenceGenerator(
            name = "delivery_s",
            sequenceName = "delivery_s",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "delivery_s"
    )
    private Long store_id;
    private String Store_name;
    private Long store_address_id;

    public Store_t() {
    }

    public Store_t(Long store_id, String store_name, Long store_address_id) {
        this.store_id = store_id;
        Store_name = store_name;
        this.store_address_id = store_address_id;
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return Store_name;
    }

    public void setStore_name(String store_name) {
        Store_name = store_name;
    }

    public Long getStore_address_id() {
        return store_address_id;
    }

    public void setStore_address_id(Long store_address_id) {
        this.store_address_id = store_address_id;
    }

    @Override
    public String toString() {
        return "Store_t{" +
                "store_id=" + store_id +
                ", Store_name='" + Store_name + '\'' +
                ", store_address_id=" + store_address_id +
                '}';
    }
}
