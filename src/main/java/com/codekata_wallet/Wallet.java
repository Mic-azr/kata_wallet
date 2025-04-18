package com.codekata_wallet;

import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private Map<String, Stock> stocks;

    public Wallet() {
        this.stocks = new HashMap<>();
    }

    public Wallet(HashMap<String, Stock> stocks) {
        this.stocks = stocks;
    }

    public void addStock(Stock stock) {
        String currency = stock.getStockType();
        if (stocks.containsKey(currency)) { //checking if stocks HashMap contains currency of the same type as Stock being put into the HashMap
            Stock existingStock = stocks.get(currency);
            existingStock.setQuantity(existingStock.getQuantity() + stock.getQuantity());
        }
        else {
            stocks.put(currency, stock);
        }
    }
    // TODO:
    // public void removeStock(Stock stock)


    public Stock getStock(String stockType) {
        return stocks.get(stockType);
    }

    // TODO:
    // public int getWalletValue() {}
    // Depends on CurrencyConverter

    
    // TODO: Create a printWalletContents method that would output the contents of the wallet in a readable format.
    // Ex:
    // """ WALLET CONTENTS """
    // 100 X USD
    // 50 X EUR
    // 250 X GBP
}
