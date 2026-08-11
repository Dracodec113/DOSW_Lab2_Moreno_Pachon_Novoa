package edu.eci.dosw.reto4;

public class CurrencyConverter {

    private ExchangeRate rate;

    public CurrencyConverter(ExchangeRate rate) {
        this.rate = rate;
    }

    public double convertAmount(
            double amount,
            Currency source,
            Currency destination) {

        double result = amount * rate.getRate(source, destination);
        return Math.round(result * 100.0) / 100.0;
    }

    private CurrencyResult buildResult(
            double amount,
            Currency source,
            Currency destination) {

        return new CurrencyResult(
                amount,
                source,
                convertAmount(amount, source, destination),
                destination
        );
    }

    public String convert(
            double amount,
            Currency source,
            Currency destination) {

        CurrencyResult result =
                buildResult(amount, source, destination);

        return "Amount: " + result.originalAmount() + "\n"
                + "Source: " + result.source() + "\n"
                + "Conversion: " + result.convertedAmount() + "\n"
                + "Destination: " + result.destination();
    }
}