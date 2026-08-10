package edu.eci.dosw.reto1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void shouldCreateProductCorrectly() {
        Product product = new Product("T-shirt", 20000);
        assertEquals("T-shirt", product.name());
        assertEquals(20000, product.price());
    }

    @Test
    void shouldCreateCartItemCorrectly() {
        Product product = new Product("Juice", 3000);
        CartItem item = new CartItem(product, 5);

        assertEquals(product, item.product());
        assertEquals(5, item.quantity());

    }
    
}
