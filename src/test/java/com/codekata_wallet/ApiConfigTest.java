package com.codekata_wallet;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Michael
 */
public class ApiConfigTest {
    private static final String TEST_API_KEY = "abcd1234efab5678cdef9021";

    @Before
    public void setUp() {
        System.setProperty("EXCHANGE_RATE_API_KEY", TEST_API_KEY);
    }

    @Test
    public void testApiConfigConstructor() {
        ApiConfig apiConfig = new ApiConfig();
        assertEquals(TEST_API_KEY, apiConfig.getApiKey());        
    }
}