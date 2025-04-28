package com.codekata_wallet;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.time.Duration;

/** 
* From Copilot: 
* "Logic: This class should interact with an external API to fetch exchange rates 
* and provide a method to convert values." 
* @author Michael
*/
public class CurrencyConverter {
    private static final String API_HOST = "v6.exchangerate-api.com";
    private final HttpClient httpClient;

    public CurrencyConverter() {
        this.httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .connectTimeout(Duration.ofSeconds(10))
        .build();
    }
    
    /**
     * Builds the API endpoint URL for getting the exchange rate between a pair of currencies
     * 
     * @param from Source currency code
     * @param to Target currency code
     * @param apiKeyString
     * @return URI object representing the API endpoint
     * @throws URISyntaxException if the URI syntax is invalid
     */
    public URI buildPairExchangeURL(String from, String to, String apiKeyString) throws URISyntaxException{
        if (from == null || to == null || apiKeyString == null) {
            throw new IllegalArgumentException("Currency codes and API key cannot be null");
        }                                  
        
        return new URI(
            "https",    //scheme
            API_HOST,    //host
            "/v6/" + apiKeyString + "/pair/" + from + "/" + to, //path
            null    //fragment
        );
    }

    public double getExchangeRate(String from, String to) {
        try {
            // TODO: create environment variable containing api key
            URI uri = buildPairExchangeURL(from, to, System.getenv("EXCHANGE_RATE_API_KEY"));
            // TODO: Implement HTTP client to fetch the rate
            // For now, returning a dummy value
            return 1.0;
        } catch (URISyntaxException e) {
            // Log the error and return a sentinel value
            System.err.println("Failed to build URL: " + e.getMessage());
            return -1;
        }
    }
}
