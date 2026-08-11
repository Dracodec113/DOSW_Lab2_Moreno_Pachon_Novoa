package edu.eci.dosw.reto4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Class that contains the unit tests for ExchangeRateMap class in main
 */

public class ExchangeRateMapTest{
    @Test
    public void shouldReturnCorrectRateWhenPairExists() {
        Map<CurrencyPair, Double> rates = Map.of(
            new CurrencyPair(Currency.USD, Currency.COP), 4000.0);
        ExchangeRateMap rateMap = new ExchangeRateMap(rates);

        double rate = rateMap.getRate(Currency.USD, Currency.COP);

        assertEquals(rate,4000.0);
    }

}