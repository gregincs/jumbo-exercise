package com.jumboexercise.jumbo.application.useCase.interfaces;

import com.jumboexercise.jumbo.domain.model.Stores;

import java.util.List;

public interface StoreUseCase {
    Stores getTopFiveClosest(double latitude, double longitude) throws Exception;
}
