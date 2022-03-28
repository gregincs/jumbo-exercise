package com.jumboexercise.jumbo.domain.model;

import java.util.List;

public class Stores {
    List<Store> stores;

    public Stores(List<Store> stores) {
        this.stores = stores;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
