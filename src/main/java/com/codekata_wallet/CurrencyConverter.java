package com.codekata_wallet;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.lang.module.ModuleDescriptor;

import com.google.gson.JsonParser;

/** 
* From Copilot: 
* "Logic: This class should interact with an external API to fetch exchange rates and provide a method to convert values." 
*/
public class CurrencyConverter {
    private String apiKey = "YOUR_API_KEY";
    private String from = "from"; //Should be a 3-letter currency code (e.g., "USD", "EUR")
    private String to = "to"; //Should be a 3-letter currency code (e.g., "USD", "EUR")
    private String apiPairExchangeEndpoint = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + from + "/" + to;

}
