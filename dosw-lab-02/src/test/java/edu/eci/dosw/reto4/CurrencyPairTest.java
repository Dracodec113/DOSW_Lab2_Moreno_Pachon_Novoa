package edu.eci.dosw.reto4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * Class that contains teh unit tests for CurrencyPair class in main
 */

public class CurrencyPairTest{
    @Test
    public void shouldBeEqual() {
        CurrencyPair pair1 = new CurrencyPair(Currency.USD, Currency.COP);
        CurrencyPair pair2 = new CurrencyPair(Currency.USD, Currency.COP);
 
        assertEquals(pair1, pair2);
        assertEquals(pair1.hashCode(), pair2.hashCode());
    }
 
    @Test
    public void shouldNotBeDifferent() {
        CurrencyPair pair1 = new CurrencyPair(Currency.USD, Currency.COP);
        CurrencyPair pair2 = new CurrencyPair(Currency.COP, Currency.USD);
 
        assertNotEquals(pair1, pair2);
    }
}