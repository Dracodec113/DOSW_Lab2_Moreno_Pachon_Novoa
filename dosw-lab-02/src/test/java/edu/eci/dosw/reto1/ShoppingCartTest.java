package edu.eci.dosw.reto1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    void shouldCalculateFrequentClientPurchaseCorrectly(){

        Client client = new Client("Juan", UserType.Frequent);

        DiscountStrategy strategy = DiscountFactory.createDiscountStrategy(UserType.Frequent);

        ShoppingCart cart = new ShoppingCart(client, strategy);

        cart.addItem(new Product("T-shirt", 20000), 2);
        cart.addItem(new Product("Cookies", 500 ), 3);
        cart.addItem(new Product("Natural-Juice", 3000), 5);

        cart.checkout();

        assertEquals(56500, cart.getSubtotal());
        assertEquals(5650, cart.getDiscount());
        assertEquals(50850, cart.getTotal());
    }

    @Test
    void shouldCalculateNewClientPurchaseCorrectly() {
        Client client = new Client("Ana", UserType.New);

        DiscountStrategy strategy = DiscountFactory.createDiscountStrategy(UserType.New);

        ShoppingCart cart = new ShoppingCart(client, strategy);

        cart.addItem(new Product("T-shirt", 20000), 2);
        cart.addItem(new Product("Cookies", 500), 3);
        cart.addItem(new Product("Natural Juice", 3000), 5);

        cart.checkout();

        assertEquals(56500, cart.getSubtotal());
        assertEquals(2825, cart.getDiscount());
        assertEquals(53675, cart.getTotal());
    }

    @Test
    void shouldGenerateReceiptWithCorrectValues(){
        Receipt receipt = new Receipt(56500, 5650, 50850);
        String result = receipt.receiptCreation();

        assertTrue(result.contains("56500"));
        assertTrue(result.contains("5650"));
        assertTrue(result.contains("50850"));

    }
    
}
