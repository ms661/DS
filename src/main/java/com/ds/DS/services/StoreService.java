package com.ds.DS.services;

import com.ds.DS.data.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    public List<Store> getStore_t() {
        return List.of(
                new Store(
                        232L,
                        "dssv"
                )
        );
    }
}
