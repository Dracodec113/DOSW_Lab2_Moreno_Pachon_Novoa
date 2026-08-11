package edu.eci.dosw.reto4;

import java.util.Map;

public class ExchangeRateMap implements ExchangeRate {

    private final Map<CurrencyPair, Double> rates;

    public ExchangeRateMap(Map<CurrencyPair, Double> rates) {
        this.rates = Map.copyOf(rates);
    }

    @Override
    public double getRate(Currency source, Currency destination) {

        if (source == destination) {
            return 1.0;
        }

        CurrencyPair pair = new CurrencyPair(source, destination);
        Double rate = rates.get(pair);

        if (rate == null) {
            throw new IllegalArgumentException(
                    "Exchange rate not found for " + source + " to " + destination
            );
        }

        return rate;
    }
}