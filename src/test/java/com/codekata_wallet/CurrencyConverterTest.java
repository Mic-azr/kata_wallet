package com.codekata_wallet;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Michael
 */
public class CurrencyConverterTest {
    @Test
    public void testBuildPairExchangeURL() throws URISyntaxException {
        String expectedURLString = "https://v6.exchangerate-api.com/v6/" + System.getenv("EXCHANGE_RATE_API_KEY") + "/pair/EUR/GBP";
        URI expectedUri = new URI(expectedURLString);

        String from = "EUR";
        String to = "GBP";
        
        CurrencyConverter converter = new CurrencyConverter();
        URI actualURI = converter.buildPairExchangeURL(from, to);

        assertEquals(expectedUri, actualURI);
    }

    // @Test
    // TODO:
    // public double testGetExchangeRate()
}
