package com.codekata_wallet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * @author Michael
 */
public class ApiConfigTest {
    @Test
    public void testApiConfigConstructor() {
        // Assuming the API key is valid and set in the environment variables
        String validKey = System.getenv("EXCHANGE_RATE_API_KEY");
        if (validKey == null) {
            fail("API key is not set in the environment variables");
        }
        ApiConfig apiConfig = new ApiConfig();
        String apiKey = apiConfig.getApiKey();
        assertTrue(apiKey != null && !apiKey.isEmpty());
        assertEquals(validKey, apiKey);
    }
}