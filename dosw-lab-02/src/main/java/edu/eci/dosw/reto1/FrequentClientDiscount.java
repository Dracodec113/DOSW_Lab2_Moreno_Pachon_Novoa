package edu.eci.dosw.reto1;

public class FrequentClientDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double subtotal) {
        return subtotal * 0.10; 
    }
}
