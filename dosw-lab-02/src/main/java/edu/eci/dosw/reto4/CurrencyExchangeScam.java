package edu.eci.dosw.reto4;

import java.util.Map;

public final class CurrencyExchangeScam {
    private CurrencyExchangeScam(){}
    
    public static void run(){
        Map<CurrencyPair, Double> rates = Map.ofEntries(
            Map.entry(new CurrencyPair(Currency.USD, Currency.COP), 3136.14),
            Map.entry(new CurrencyPair(Currency.USD, Currency.EUR), 0.87),
            Map.entry(new CurrencyPair(Currency.USD, Currency.JPY), 158.91),
            Map.entry(new CurrencyPair(Currency.COP, Currency.USD), 0.00032),
            Map.entry(new CurrencyPair(Currency.COP, Currency.JPY), 0.051),
            Map.entry(new CurrencyPair(Currency.COP, Currency.EUR), 0.00028),
            Map.entry(new CurrencyPair(Currency.EUR, Currency.USD), 1.16),
            Map.entry(new CurrencyPair(Currency.EUR, Currency.JPY), 183.55),
            Map.entry(new CurrencyPair(Currency.EUR, Currency.COP), 3617.95),
            Map.entry(new CurrencyPair(Currency.JPY, Currency.USD), 0.0063),
            Map.entry(new CurrencyPair(Currency.JPY, Currency.EUR), 0.0054),
            Map.entry(new CurrencyPair(Currency.JPY, Currency.COP), 19.68)
        );
        
        ExchangeRateMap rateMap = new ExchangeRateMap(rates);
        CurrencyConverter converter = new CurrencyConverter(rateMap);
        System.out.println(converter.convert(4000, Currency.COP, Currency.USD));
    }
}
