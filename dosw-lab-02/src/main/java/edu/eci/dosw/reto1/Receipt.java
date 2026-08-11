package edu.eci.dosw.reto1;

public class Receipt {
    private final double subtotal;
    private final double discount;
    private final double total;

    public Receipt(double subtotal, double discount, double total) {
        this.subtotal = subtotal;
        this.discount = discount;
        this.total = total;
    }

    public String receiptCreation() {
        return "Subtotal: " + subtotal + "\n" +
               "Discount: " + discount + "\n" +
               "Total: " + total;
    }
}
