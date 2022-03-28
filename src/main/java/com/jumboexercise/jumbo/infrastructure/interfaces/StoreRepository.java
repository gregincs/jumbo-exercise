package com.jumboexercise.jumbo.infrastructure.interfaces;

import com.jumboexercise.jumbo.domain.model.Stores;

import java.util.List;

public interface StoreRepository {
    Stores getAllStores() throws Exception;
}
