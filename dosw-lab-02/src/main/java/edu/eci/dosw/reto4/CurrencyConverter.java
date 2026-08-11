package edu.eci.dosw.reto4;


public class CurrencyConverter {
    private ExchangeRate rate;

    public CurrencyConverter(ExchangeRate rate){
        this.rate = rate;
    }

    private double convertTo(double amount, Currency source, Currency destination){
        return amount * rate.getRate(source, destination);
    }

    private CurrencyResult buildResult(double amount, Currency source, Currency destination){
        return new CurrencyResult(amount, source, convertTo(amount, source, destination), destination);
    }

    public String convert(double amount, Currency source, Currency destination){
        CurrencyResult result = buildResult(amount, source, destination);
        return "Amount: "+ result.originalAmount() + "\n" +
        "Source: " + result.source() + "\n" +
        "Conversion: " + result.convertedAmount() + "\n" +
        "Destination: " + result.destination();
    }
}
