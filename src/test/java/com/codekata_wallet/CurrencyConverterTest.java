package com.codekata_wallet;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {
    @Test
    public void testBuildPairExchangeURL() throws URISyntaxException {
        String expectedURLString = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP";
        URI expectedUri = new URI(expectedURLString);

        String from = "EUR";
        String to = "GBP";
        String testAPIKeyString = "YOUR-API-KEY";

        CurrencyConverter converter = new CurrencyConverter();
        URI actualURI = converter.buildPairExchangeURL(from, to, testAPIKeyString);

        assertEquals(expectedUri, actualURI);
    }
}
