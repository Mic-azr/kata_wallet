package com.codekata_wallet;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/** 
* From Copilot: 
* "Logic: This class should interact with an external API to fetch exchange rates 
* and provide a method to convert values." 
* @author Michael
*/
public class CurrencyConverter {
    private static final String API_HOST = "v6.exchangerate-api.com";
    private final ApiConfig apiConfig;
    private final HttpClient httpClient;

    public CurrencyConverter() {
        this.apiConfig = new ApiConfig();
        this.httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .connectTimeout(Duration.ofSeconds(10))
        .build();
    }

    /**
     * TODO: buildStandardExchangeURL
     * @param from
     * @return URI object representing the API endpoint
     * @throws URISyntaxException
     */
    
    /**
     * Builds the API endpoint URL for getting the exchange rate between a pair of currencies
     * 
     * @param from Source currency code
     * @param to Target currency code
     * @param apiKeyString
     * @return URI object representing the API endpoint
     * @throws URISyntaxException if the URI syntax is invalid
     */
    public URI buildPairExchangeURL(String from, String to) throws URISyntaxException{
        if (from == null || to == null || apiConfig.getApiKey() == null) {
            throw new IllegalArgumentException("Currency codes and API key cannot be null");
        }                                  
        
        return new URI(
            "https",    //scheme
            API_HOST,    //host
            "/v6/" + apiConfig.getApiKey() + "/pair/" + from + "/" + to, //path
            null    //fragment
        );
    }

    public double getPairExchangeRate(String from, String to) {
        try {
            URI uri = buildPairExchangeURL(from, to);

            HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .timeout(Duration.ofSeconds(10))
                .header("Accept", "application/json")
                .build();
            
            // Using synchronous HttpResponse API https://openjdk.org/groups/net/httpclient/intro.html
            // Could try refactoring to use asynchronous API for future exercise
            HttpResponse<String> response = httpClient.send(
                request, 
                HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() == 200) {
                // Parse the response to extract the exchange rate
                return 1.0; // return a variable of type double representing the exchange rate
            } else {
                throw new RuntimeException("API call failed with status: " + response.statusCode());
            }

        } catch (URISyntaxException | IOException | InterruptedException e) {
            // Log the error and return a sentinel value
            System.err.println("Failed to build URL: " + e.getMessage());
            return -1;
        }
    }
}
