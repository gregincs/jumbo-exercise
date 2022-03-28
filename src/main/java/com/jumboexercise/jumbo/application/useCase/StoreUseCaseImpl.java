package com.jumboexercise.jumbo.application.useCase;

import com.jumboexercise.jumbo.application.useCase.interfaces.StoreUseCase;
import com.jumboexercise.jumbo.domain.model.Store;
import com.jumboexercise.jumbo.domain.model.Stores;
import com.jumboexercise.jumbo.infrastructure.interfaces.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.stream.Collectors;

@Service
public class StoreUseCaseImpl implements StoreUseCase {

    @Autowired
    private StoreRepository repository;

    @Override
    public Stores getTopFiveClosest(double latitude, double longitude) throws Exception {
        var stores = repository.getAllStores();
        stores.getStores().stream().forEach(s -> s.distanceFromCurrentLocation = calculateDistance(latitude, longitude, s.getLatitude(), s.getLongitude()));

        var topFiveOrderedStores = stores.getStores().stream()
                .sorted(Comparator.comparing(Store::getDistanceFromCurrentLocation))
                .limit(5)
                .collect(Collectors.toList());

        var response = new Stores(topFiveOrderedStores);

        return response;
    }

    private double calculateDistance(double originLat, double originLon, double destinyLat, double destinyLon) {
        double earthRadius = 6371000; //meters

        var originLatRadians = calculateRadians(originLat);
        var destinyLatRadians = calculateRadians(destinyLat);
        var deltaLatRadians = calculateRadians(originLat - destinyLat);
        var deltaLonRadians = calculateRadians(originLon - destinyLon);

        double arcsin = Math.asin(
                Math.sqrt(
                        Math.pow(Math.sin(deltaLatRadians/2), 2) + Math.cos(originLatRadians) * Math.cos(destinyLatRadians) * Math.pow(Math.sin(deltaLonRadians/2), 2)
                ));

        double distanceInMeters = 2 * earthRadius * arcsin;

        return distanceInMeters;
    }

    private double calculateRadians(double value) {
        return value * Math.PI/180;
    }
}
