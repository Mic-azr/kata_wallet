/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.codekata_wallet;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class StockTest {
    @Test
    public void testStockConstructorAndGetters(){
        int expectedQuantity = 101;
        int actualQuantity = 101;
        String expectedStockType = "USD";
        String actualStockType = "USD";

        Stock stock = new Stock(actualQuantity, actualStockType);

        assertEquals("Quantity should equal" + expectedQuantity, expectedQuantity, stock.getQuantity());
        assertEquals("StockType should equal" + expectedStockType, expectedStockType, stock.getStockType());
    }

    @Test
    public void testStockToString() {
        int testQuantity = 125;
        String testStockType = "EUR";

        Stock stock = new Stock(testQuantity, testStockType);

        assertEquals("Strings should be equal", "Stock{quantity=125, stockType='EUR'}", stock.toString());
    }
}