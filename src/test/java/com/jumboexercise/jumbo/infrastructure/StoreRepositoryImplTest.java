package com.jumboexercise.jumbo.infrastructure;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreRepositoryImplTest {

    @Test
    public void ShouldGetStoresSuccessfully() throws Exception {
        //Arrange
        var repo = new StoreRepositoryImpl();

        //Act
        var stores = repo.getAllStores();

        //Assert
        Assert.assertEquals(stores.getStores().size(), 587);
    }

    @Test(expected = Exception.class)
    public void ShouldThrowErrorNotFindingFile() throws Exception {
        //Arrange
        var repo = new StoreRepositoryImpl();
        ReflectionTestUtils.setField(repo, "STORE_JSON_FILE_NAME", "file");

        //Act
        repo.getAllStores();

        //Assert
    }
}
