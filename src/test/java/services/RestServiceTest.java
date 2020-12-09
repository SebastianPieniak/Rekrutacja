package services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RestServiceTest {
    RestService restService = new RestService();

    @Test
    void getDataFromRestNullTest() {
        assertNotNull(restService.getDataFromRest());
    }

    @Test
    void getDataFromRestIntTest() {
        assertTrue(Integer.class.isInstance(restService.getDataFromRest()));
    }
}