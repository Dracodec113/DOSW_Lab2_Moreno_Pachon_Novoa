package edu.eci.dosw.reto1;

public class NewClientDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double subtotal) {
        return subtotal * 0.05; 
    }
}
