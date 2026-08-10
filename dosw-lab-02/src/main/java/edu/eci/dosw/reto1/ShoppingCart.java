package edu.eci.dosw.reto1;
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<CartItem> items;
    private Receipt receipt;
    private DiscountStrategy discountStrategy;
    private double subtotal;
    private double discount;
    private double total;

    public ShoppingCart(Client client, DiscountStrategy discountStrategy) {
        this.items = new ArrayList<>();
        this.discountStrategy = discountStrategy;
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    private double calculateSubtotal(){
        return items.stream()
                .mapToDouble(item -> item.product().price() * item.quantity())
                .sum();
    }

    private double calculateTotal() {
        this.subtotal = calculateSubtotal();
        this.discount = discountStrategy.applyDiscount(subtotal);
        this.total = subtotal - discount;
        return total;
    }

    private Receipt generateReceipt() {
        calculateTotal();
        this.receipt = new Receipt(subtotal, discount, total);
        return receipt;
    }

    public Receipt checkout() {
        receipt = generateReceipt();
        this.items.clear();
        return receipt;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }
}
