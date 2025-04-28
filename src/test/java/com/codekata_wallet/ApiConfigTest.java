package com.codekata_wallet;

import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * @author Michael
 */
public class ApiConfigTest {
    @Test
    public void testApiConfigConstructor() {
        String testApiKey = "a1b2c3d4e5F6G7H8I9J0k321";
        try {
            ApiConfig testApiConfig = new ApiConfig(testApiKey);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}