package com.codekata_wallet;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
/** 
* From Copilot: 
* "Logic: This class should interact with an external API to fetch exchange rates and provide a method to convert values." 
*/
public class CurrencyConverter {
    private String apiKey = "YOUR_API_KEY";
    private String apiExchangeEndpoint = "https://v1.apiplugin.io/v1/currency/" + apiKey + "/rates/convert";

    // public CurrencyConverter() {
    // public double getExchangeRate(String fromCurrency, String toCurrency) {
    // try {
    // HttpClient client = HttpClient.newHttpClient();
}
