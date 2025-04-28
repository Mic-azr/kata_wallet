package com.codekata_wallet;

/**
 * Class for validating the API key supplied by the user
 * @author Michael 
 */

public class ApiConfig {
    private static final int API_KEY_EXPECTED_LENGTH = 24;
    private static final String API_KEY_PATTERN = "^[A-Za-z0-9]+$";

    private final String apiKey;

    public ApiConfig(String apiKey) {
        validateApiKey(apiKey);
        this.apiKey = apiKey;
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
