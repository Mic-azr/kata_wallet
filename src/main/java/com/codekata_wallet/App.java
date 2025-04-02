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
        //Convert value in wallet to another currency using external API
        //Wallet(Stock(quantity, StockType))
        //Value value = Wallet.getValue()
        // Need to make calls to an external API for currency types and exchange rates.
        // Some I'm looking at:
        // https://openexchangerates.org/about
        // https://api.fixer.io/
        // https://currencyapi.com/
    }
}
