package com.codekata_wallet;

import java.io.IOException;
import java.util.Properties;

/**
 * Class for validating the API key supplied by the user
 * @author Michael 
 */
public class ApiConfig {
    private static final Properties properties = new Properties();
    private static final int API_KEY_EXPECTED_LENGTH;
    private static final String API_KEY_PATTERN;

    static {
        try {
            properties.load(ApiConfig.class.getClassLoader()
                .getResourceAsStream("config.properties"));
            API_KEY_EXPECTED_LENGTH = Integer.parseInt(
                properties.getProperty("api.key.length", "24"));
            API_KEY_PATTERN = properties.getProperty("api.key.pattern", "^[A-Za-z0-9]+$");
        } catch (IOException e) {
            throw new ExceptionInInitializerError("Failed to load config.properties");
        }
    }

    private final String apiKey;

    public ApiConfig() {
        String loadedKey = System.getenv("EXCHANGE_RATE_API_KEY");
        if (loadedKey == null) {
            loadedKey = properties.getProperty("exchange.rate.api.key");
        }
        validateApiKey(loadedKey);
        this.apiKey = loadedKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    private void validateApiKey(String apiKey) {
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalArgumentException("API key cannot be null or empty");
        }
        
        if (apiKey.length() != API_KEY_EXPECTED_LENGTH) {
            throw new IllegalArgumentException("API key length is invalid");
        }
        
        if (!apiKey.matches(API_KEY_PATTERN)) {
            throw new IllegalArgumentException("API key contains invalid characters");
        }
    }
}
