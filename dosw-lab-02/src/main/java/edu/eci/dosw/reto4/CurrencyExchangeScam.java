package edu.eci.dosw.reto4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class CurrencyExchangeScam {

    private CurrencyExchangeScam() {
    }

    private static Currency readCurrency(Scanner scanner, String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.next().toUpperCase();

            try {
                return Currency.valueOf(input);

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "Invalid currency. Please enter USD, EUR, JPY or COP."
                );
            }
        }
    }

    public static void run() {

        System.out.println("CHALLENGE 4: CURRENCY EXCHANGE SCAM");

        // Exchange rates for each currency pair
        Map<CurrencyPair, Double> rates = Map.ofEntries(

                Map.entry(
                        new CurrencyPair(Currency.USD, Currency.COP),
                        3136.14
                ),

                Map.entry(
                        new CurrencyPair(Currency.USD, Currency.EUR),
                        0.87
                ),

                Map.entry(
                        new CurrencyPair(Currency.USD, Currency.JPY),
                        158.91
                ),

                Map.entry(
                        new CurrencyPair(Currency.COP, Currency.USD),
                        0.00032
                ),

                Map.entry(
                        new CurrencyPair(Currency.COP, Currency.JPY),
                        0.051
                ),

                Map.entry(
                        new CurrencyPair(Currency.COP, Currency.EUR),
                        0.00028
                ),

                Map.entry(
                        new CurrencyPair(Currency.EUR, Currency.USD),
                        1.16
                ),

                Map.entry(
                        new CurrencyPair(Currency.EUR, Currency.JPY),
                        183.55
                ),

                Map.entry(
                        new CurrencyPair(Currency.EUR, Currency.COP),
                        3617.95
                ),

                Map.entry(
                        new CurrencyPair(Currency.JPY, Currency.USD),
                        0.0063
                ),

                Map.entry(
                        new CurrencyPair(Currency.JPY, Currency.EUR),
                        0.0054
                ),

                Map.entry(
                        new CurrencyPair(Currency.JPY, Currency.COP),
                        19.68
                )
        );

        ExchangeRateMap rateMap = new ExchangeRateMap(rates);

        CurrencyConverter converter = new CurrencyConverter(rateMap);

        List<CurrencyTransaction> transactions = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many transactions do you want to make? ");
        int numberOfTransactions = scanner.nextInt();

        // Read all transactions
        for (int i = 0; i < numberOfTransactions; i++) {

            System.out.println("\nTransaction " + (i + 1));

            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            Currency source = readCurrency(
                    scanner,
                    "Enter the source currency (USD, EUR, JPY, COP): "
            );

            Currency destination = readCurrency(
                    scanner,
                    "Enter the destination currency (USD, EUR, JPY, COP): "
            );

            transactions.add(
                    new CurrencyTransaction(
                            amount,
                            source,
                            destination
                    )
            );
        }

        // Show all conversions
        transactions.stream()
                .forEach(transaction -> {

                    System.out.println("--------------------");

                    System.out.println(
                            converter.convert(
                                    transaction.amount(),
                                    transaction.source(),
                                    transaction.destination()
                            )
                    );
                });

        // Calculate totals by destination currency using Java Streams
        System.out.println("--------------------");
        System.out.println("TOTALS BY DESTINATION CURRENCY:");

        transactions.stream()
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                CurrencyTransaction::destination,
                                java.util.stream.Collectors.summingDouble(
                                        transaction ->
                                                converter.convertAmount(
                                                        transaction.amount(),
                                                        transaction.source(),
                                                        transaction.destination()
                                                )
                                )
                        )
                )
                .forEach(
                        (currency, total) ->
                                System.out.println(
                                        currency + ": " + total
                                )
                );
    }
}