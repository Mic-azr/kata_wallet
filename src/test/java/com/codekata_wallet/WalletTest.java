/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.codekata_wallet;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class WalletTest {
    @Test
    public void testWalletDefaultConstructor() {
        try {
            Wallet testWallet = new Wallet();
        } 
        catch (Exception e) {
            fail(e.getMessage());
        }
    }

    // TODO:
    // @Test
    // public void testWalletOverloadedConstructor() {
    //  HashMap<String, Stock> testStockHashMap = new HashMap<>();
    // try {
    //  Wallet testWallet(testStockHashMap) = new Wallet();
    //  }
    // catch(Exception e) {
    //  fail(e.getMessage());
    //  }
    // }
    
    @Test
    public void testAddStock() {
        Stock expectedStock1 = new Stock(20, "USD");
        Stock expectedStock2 = new Stock(50, "GBP");
        Stock expectedStock3 = new Stock(10, "AUS");
        Stock expectedStock4 = new Stock(100, "USD");
        Stock actualStock1 = new Stock(20, "USD");
        Stock actualStock2 = new Stock(50, "GBP");
        Stock actualStock3 = new Stock(10, "AUS");
        Stock actualStock4 = new Stock(100, "USD");

        Map<String, Stock> expectedStocksHashMap = new HashMap<>();
        expectedStocksHashMap.put(expectedStock1.getStockType(), expectedStock1);
        expectedStocksHashMap.put(expectedStock2.getStockType(), expectedStock2);
        expectedStocksHashMap.put(expectedStock3.getStockType(), expectedStock3);
        Stock existingStock = expectedStocksHashMap.get(expectedStock1.getStockType());
        existingStock.setQuantity(existingStock.getQuantity() + expectedStock4.getQuantity());

        Wallet testWallet = new Wallet();
        testWallet.addStock(actualStock1);
        testWallet.addStock(actualStock2);
        testWallet.addStock(actualStock3);
        testWallet.addStock(actualStock4);

        assertEquals(testWallet.getStock("USD").getQuantity(), expectedStocksHashMap.get("USD").getQuantity());
        assertEquals(testWallet.getStock("GBP").getQuantity(), expectedStocksHashMap.get("GBP").getQuantity());
        assertEquals(testWallet.getStock("AUS").getQuantity(), expectedStocksHashMap.get("AUS").getQuantity());
    }

    // TODO: 
    // @Test
    // public int testGetTotalValue()
    
    // TODO: 
    // @Test
    // public void testprintWalletContents()
}