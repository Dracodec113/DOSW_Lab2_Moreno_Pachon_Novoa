package edu.eci.dosw.reto4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Class that includes the unit tests for CurrencyConverter class in main
 */

public class CurrencyConverterTest{
    @Test
    public void shouldConvertAndFormatResultCorrectly() {
        Map<CurrencyPair, Double> rates = Map.of(
            new CurrencyPair(Currency.USD, Currency.COP), 4000.0
        );
        ExchangeRate exchangeRateMap = new ExchangeRateMap(rates);
        CurrencyConverter converter = new CurrencyConverter(exchangeRateMap);

        double amount = 100.0;

        String result = converter.convert(amount, Currency.USD, Currency.COP);
        String expectedOutput = "Amount: 100.0\n" +
                                "Source: USD\n" +
                                "Conversion: 400000.0\n" +
                                "Destination: COP";

        assertEquals(result,expectedOutput);
    }
}