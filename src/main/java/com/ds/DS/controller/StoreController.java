package com.ds.DS.controller;

import com.ds.DS.data.Store;
import com.ds.DS.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Store")
public class StoreController {

    private final StoreService store_tService;

    @Autowired
    public StoreController(StoreService store_tService){
        this.store_tService = store_tService;
    }

    @GetMapping
    public List<Store> getStore_t() {
      return store_tService.getStore_t();
    }
}
