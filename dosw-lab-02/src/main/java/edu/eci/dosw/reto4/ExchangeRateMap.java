package edu.eci.dosw.reto4;
import java.util.Map;

public class ExchangeRateMap implements ExchangeRate{

    private Map<CurrencyPair, Double> rates;

    public ExchangeRateMap(Map<CurrencyPair, Double> rates){
        this.rates = rates;
    }
    
    @Override
    public double getRate(Currency source, Currency destination){
        CurrencyPair pair = new CurrencyPair(source, destination);
        Double rate = rates.get(pair);
        return rate;
    }

}
