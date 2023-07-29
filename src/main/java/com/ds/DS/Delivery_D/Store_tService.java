package com.ds.DS.Delivery_D;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Store_tService {
    public List<Store_t> getStore_t() {
        return List.of(
                new Store_t(
                        232L,
                        "dssv",
                        324L
                )
        );
    }
}
