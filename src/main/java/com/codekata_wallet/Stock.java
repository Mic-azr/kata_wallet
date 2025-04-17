package com.codekata_wallet;

public class Stock {
    private int quantity;
    private String stockType;

    public Stock(int quantity, String stockType) {
        // Error checking provided by smartypants Copilot while I was asking about something in the pom.xml file :p
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (stockType == null || stockType.trim().isEmpty()) {
            throw new IllegalArgumentException("Stock type cannot be null or empty");
        }
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

    @Override
    public String toString() {
        return "Stock{quantity=" + this.getQuantity() + ", stockType='" + this.getStockType() + "'}";
    }
}
