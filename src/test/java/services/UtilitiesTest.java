package services;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private final Utilities utilities = new Utilities();

    @Test
    void readFromInputStream() throws IOException {

        byte[] data = "1,2,3".getBytes();

        InputStream input = new ByteArrayInputStream(data);

        assertEquals("1,2,3", utilities.readFromInputStream(input));



    }
}