package com.codekata_wallet;

/**
 * Exercise taken from https://codingdojo.org/kata/Wallet/
 * Given a Wallet containing Stocks, build a function that computes the value of the wallet in a currency.
 * The Stocks have a quantity and a StockType. The StockType can be for example petroleum, Euros, bitcoins and Dollars.
 * To value the portfolio in a Currency you can use external api to provide rate exchanges
 * 
 * @author Michael
 */
public class App 
{
    public static void main( String[] args )
    {
        // Convert value in wallet to another currency using external API
        //
        // Given object sample:
        // Value value = Wallet(Stock(5, PETROLEUM)).value(EUR, rateProvider)
        //
        // CurrencyConverter should be an example of this interface:
        // CurrencyConverter.convert(from: StockType, to: Currency) -> double

    }
}
