package edu.eci.dosw.reto4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Class that contains the unit tests for CurrencyResult class in main
 */

public class CurrencyResultTest{
    @Test
    public void shouldSaveAll() {
        CurrencyResult result = new CurrencyResult(4000, Currency.COP, 
            1.28, Currency.USD);
 
        assertEquals(4000, result.originalAmount());
        assertEquals(Currency.COP, result.source());
        assertEquals(1.28, result.convertedAmount());
        assertEquals(Currency.USD, result.destination());
    }
}