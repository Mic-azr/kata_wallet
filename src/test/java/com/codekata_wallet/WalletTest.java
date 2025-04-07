/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.codekata_wallet;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class WalletTest {
    @Test
    public void testWalletConstructorAndGetters() {
        LinkedList<Stock> expectedStocks = new LinkedList<>();
        LinkedList<Stock> actualStocks = new LinkedList<>();

        Stock stock1 = new Stock(100, "USD");
        Stock stock2 = new Stock(50, "EUR");

        expectedStocks.add(stock1);
        expectedStocks.add(stock2);
        actualStocks.add(stock1);
        actualStocks.add(stock2);

        Wallet wallet = new Wallet(actualStocks);
        assertEquals("Stocks should equal" + expectedStocks, expectedStocks, wallet.getStocks()); //Wallet should contain a LinkedList of Stocks equal to actualStocks
    }

    // TODO: testGetTotalValue
    // @Test
}