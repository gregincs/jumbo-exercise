package com.jumboexercise.jumbo.api.controller;

import com.jumboexercise.jumbo.application.useCase.interfaces.StoreUseCase;
import com.jumboexercise.jumbo.mockedObjects.StoresMocked;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = StoresController.class)
public class StoresControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StoreUseCase storeUseCase;

    @Test
    public void ShouldGetTopFiveSuccessfully() throws Exception {
        //Arrange
        given(storeUseCase.getTopFiveClosest(51.613692, 5.538258)).willReturn(StoresMocked.getTopFiveOk());

        //Act
        //Assert
        this.mockMvc.perform(get("/api/v1/stores?lat={lat}&lon={lon}", 51.613692, 5.538258))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("63UKYx4XPsEAAAFQvl1eATqA")))
                .andExpect(content().string(containsString("w98KYx4X318AAAFIqFYYwKxK")))
                .andExpect(content().string(containsString("SjwKYx4XWsYAAAFIpy8YwKxK")))
                .andExpect(content().string(containsString("qe4KYx4X_K8AAAFIK0gYwKrH")))
                .andExpect(content().string(containsString("0hkKYx4X1wEAAAFJ0VpBh0Gd")));
    }

    @Test
    public void ShouldThrowBadRequestMissingLat() throws Exception {
        //Arrange
        //Act
        //Assert
        this.mockMvc.perform(get("/api/v1/stores"))
                .andExpect(status().isBadRequest())
                .andExpect(status().reason(containsString("Required request parameter 'lat' for method parameter type double is not present")));
    }

    @Test
    public void ShouldThrowBadRequestMissingLon() throws Exception {
        //Arrange
        //Act
        //Assert
        this.mockMvc.perform(get("/api/v1/stores?lat=12.3"))
                .andExpect(status().isBadRequest())
                .andExpect(status().reason(containsString("Required request parameter 'lon' for method parameter type double is not present")));
    }

    @Test
    public void ShouldThrowBadRequestLatLonAsString() throws Exception {
        //Arrange
        //Act
        //Assert
        this.mockMvc.perform(get("/api/v1/stores?lat=&lon="))
                .andExpect(status().isBadRequest());
    }
}
