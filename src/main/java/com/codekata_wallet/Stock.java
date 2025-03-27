package com.codekata_wallet;

public class Stock {
    private int quantity;
    private String stockType;

    public Stock(int quantity, String stockType) {
        this.quantity = quantity;
        this.stockType = stockType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStockType() {
        return stockType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }
}
