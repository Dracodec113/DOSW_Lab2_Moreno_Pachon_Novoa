package edu.eci.dosw.reto4;

public record CurrencyTransaction(
        double amount,
        Currency source,
        Currency destination
) {
}