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
        int quantity = 101;
        String stockType = "USD";

        Stock stock = new Stock(quantity, stockType);

        assertEquals("Quantity should equal 101", quantity, stock.getQuantity());
        assertEquals("StockType should equal USD", stockType, stock.getStockType());
    }

}