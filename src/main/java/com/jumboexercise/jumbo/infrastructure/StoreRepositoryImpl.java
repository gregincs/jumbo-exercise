package com.jumboexercise.jumbo.infrastructure;

import com.google.gson.*;
import com.jumboexercise.jumbo.domain.model.Stores;
import com.jumboexercise.jumbo.infrastructure.interfaces.StoreRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStreamReader;
import java.io.Reader;
import java.text.MessageFormat;

@Service
public class StoreRepositoryImpl implements StoreRepository {

    @Value("${storesFile.name}")
    private String STORE_JSON_FILE_NAME;

    @Override
    public Stores getAllStores() throws Exception {
        try {
            Reader reader = new InputStreamReader(getClass().getResourceAsStream(STORE_JSON_FILE_NAME));
            JsonElement jsonStoreString = JsonParser.parseReader(reader);
            Stores stores = new Gson().fromJson(jsonStoreString, Stores.class);

            return stores;
        } catch(Exception e) {
            throw new Exception(MessageFormat.format("Error trying to get stores: {0}", e.getMessage()));
        }
    }
}
