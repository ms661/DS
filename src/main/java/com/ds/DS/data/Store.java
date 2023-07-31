package com.ds.DS.data;

import jakarta.persistence.*;

@Entity
@Table
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long storeId;
    @Column
    private String storeName;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private StoreAddress storeAddress;

    public Store() {
    }

    public Store(Long storeId, String storeName) {
        this.storeId = storeId;
        storeName = storeName;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        storeName = storeName;
    }


    @Override
    public String toString() {
        return "Store{" +
                "store_id=" + storeId +
                ", store_name='" + storeName + '\'' +
                '}';
    }
}
