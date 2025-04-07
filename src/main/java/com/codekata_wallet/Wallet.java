package com.codekata_wallet;

import java.util.LinkedList;

public class Wallet {
    private LinkedList<Stock> stocks = new LinkedList<>(); 

    public Wallet (LinkedList<Stock> stocks) {
        this.stocks = stocks;
    }
    public void addStock(Stock stock) {
        this.stocks.add(stock);
    }
    public void removeStock(Stock stock) {
        this.stocks.remove(stock);
    }
    public LinkedList<Stock> getStocks() {
        return this.stocks;
    }
    public double getTotalValue(String targetCurrency, CurrencyConverter currencyConverter) {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            double exchangeRate = currencyConverter.getExchangeRate(stock.getStockType(), targetCurrency);
            totalValue += stock.getQuantity() * exchangeRate;
        }
        return totalValue;
    }
    
    // TODO: Create a printWalletContents method that would output the contents of the wallet in a readable format.
    // Ex:
    // """ WALLET CONTENTS """
    // 100 X USD
    // 50 X EUR
    // 250 X GBP
}
