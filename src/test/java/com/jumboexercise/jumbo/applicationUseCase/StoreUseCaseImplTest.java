package com.jumboexercise.jumbo.applicationUseCase;

import com.jumboexercise.jumbo.application.useCase.StoreUseCaseImpl;
import com.jumboexercise.jumbo.infrastructure.interfaces.StoreRepository;
import com.jumboexercise.jumbo.mockedObjects.StoresMocked;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreUseCaseImplTest {

    @Mock
    private StoreRepository repository;

    @InjectMocks
    private StoreUseCaseImpl useCase;

    @Test
    public void ShouldReturnTopFiveClosestStoresSuccessfully() throws Exception {
        //Arrange
        when(repository.getAllStores()).thenReturn(StoresMocked.getStoresOk());

        //Act
        var topFiveClosestStores = useCase.getTopFiveClosest(51.613692, 5.538258);

        //Assert
        Assert.assertEquals(topFiveClosestStores.getStores().size(), 5);

        Assert.assertEquals(topFiveClosestStores.getStores().get(0).uuid, "Tk0KYx4XZ3YAAAFc_DRE1DKo");
        Assert.assertEquals(topFiveClosestStores.getStores().get(0).distanceFromCurrentLocation, 24249.102262749402, 10);

        Assert.assertEquals(topFiveClosestStores.getStores().get(1).uuid, "xf0KYx4XpRcAAAFIL5EYwKxK");
        Assert.assertEquals(topFiveClosestStores.getStores().get(1).distanceFromCurrentLocation, 43550.56126204471, 10);

        Assert.assertEquals(topFiveClosestStores.getStores().get(2).uuid, "7ewKYx4Xqp0AAAFIHigYwKrH");
        Assert.assertEquals(topFiveClosestStores.getStores().get(2).distanceFromCurrentLocation, 56681.06215526616, 10);

        Assert.assertEquals(topFiveClosestStores.getStores().get(3).uuid, "xSgKYx4XXk0AAAFTOqsG6pvj");
        Assert.assertEquals(topFiveClosestStores.getStores().get(3).distanceFromCurrentLocation, 59928.22247004785, 10);

        Assert.assertEquals(topFiveClosestStores.getStores().get(4).uuid, "uM0KYx4X0l0AAAFIDEEYwKrH");
        Assert.assertEquals(topFiveClosestStores.getStores().get(4).distanceFromCurrentLocation, 61806.636487709664, 10);
    }
}
