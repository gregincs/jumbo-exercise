package com.jumboexercise.jumbo.api.controller;

import com.jumboexercise.jumbo.application.useCase.interfaces.StoreUseCase;
import com.jumboexercise.jumbo.domain.model.Store;
import com.jumboexercise.jumbo.domain.model.Stores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class StoresController {

    @Autowired
    private StoreUseCase useCase;

    @GetMapping("/stores")
    public ResponseEntity<Stores> getStores(@RequestParam(name = "lat") double latitude, @RequestParam(name = "lon") double longitude) throws Exception {
        var topFiveClosestStores = useCase.getTopFiveClosest(latitude, longitude);

        if (topFiveClosestStores.getStores().size() == 0) {
            ResponseEntity.status(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.status(HttpStatus.OK).body(topFiveClosestStores);
    }
}
