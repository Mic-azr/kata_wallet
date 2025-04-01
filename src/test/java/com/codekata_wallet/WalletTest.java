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
public class WalletTest {

    @Test
    public void testWalletConstructorsAndGetters() {
        int quantity = 100;
        String stockType = "USD";

        Wallet wallet = new Wallet(quantity, stockType);

        assertEquals("Quantity should equal 100", quantity, wallet.getQuantity());
        assertEquals("StockType should equal USD", stockType, wallet.getStockType());
    }

}