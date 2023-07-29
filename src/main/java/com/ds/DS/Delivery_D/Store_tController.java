package com.ds.DS.Delivery_D;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Store_t")
public class Store_tController {

    private final Store_tService store_tService;

    @Autowired
    public Store_tController(Store_tService store_tService){
        this.store_tService = store_tService;
    }

    @GetMapping
    public List<Store_t> getStore_t() {
      return store_tService.getStore_t();
    }
}
