package com.codekata_wallet;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Michael
 */
public class CurrencyConverterTest {
    private static final String TEST_API_KEY = "abcd1234efab5678cdef9021";

    @Before
    public void setUp() {
        System.setProperty("EXCHANGE_RATE_API_KEY", TEST_API_KEY);
    }
    
    @Test
    public void testBuildPairExchangeURL() throws URISyntaxException {
        String expectedURLString = "https://v6.exchangerate-api.com/v6/" + System.getProperty("EXCHANGE_RATE_API_KEY") + "/pair/EUR/GBP";
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
