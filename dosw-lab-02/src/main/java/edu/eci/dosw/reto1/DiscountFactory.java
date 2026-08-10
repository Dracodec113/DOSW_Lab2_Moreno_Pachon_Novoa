package edu.eci.dosw.reto1;

public class DiscountFactory {
    public static DiscountStrategy createDiscountStrategy(UserType userType) {
        return switch (userType) {
            case New -> new NewClientDiscount();
            case Frequent -> new FrequentClientDiscount();
        };
    }
}
