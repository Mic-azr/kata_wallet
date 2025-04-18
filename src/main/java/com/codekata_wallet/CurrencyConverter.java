package com.codekata_wallet;

import java.net.URI;
import java.net.URISyntaxException;

/** 
* From Copilot: 
* "Logic: This class should interact with an external API to fetch exchange rates and provide a method to convert values." 
*/
public class CurrencyConverter {
    private static final String API_HOST = "v6.exchangerate-api.com";
    
    /**
     * Builds the API endpoint URL for getting the exchange rate between a pair of currencies
     * 
     * @param from Source currency code
     * @param to Target currency code
     * @param apiKeyString
     * @return URI object representing the API endpoint
     * @throws URISyntaxException if the URI syntax is invalid
     */
    private URI buildPairExchangeURL(String from, String to, String apiKeyString) throws URISyntaxException{
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

    // TODO:
    // public double getExchangeRate(String from, String to)
}
