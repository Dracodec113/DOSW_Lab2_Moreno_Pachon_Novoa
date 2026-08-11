
package edu.eci.dosw.reto1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiscountTest {

    @Test
    void shouldApplyFivePercentDiscountForNewClient() {
        DiscountStrategy strategy = new NewClientDiscount();

        double discount = strategy.applyDiscount(100000);

        assertEquals(5000, discount);
    }

    @Test
    void shouldApplyTenPercentDiscountForFrequentClient() {
        DiscountStrategy strategy = new FrequentClientDiscount();

        double discount = strategy.applyDiscount(100000);

        assertEquals(10000, discount);
    }

    @Test
    void shouldCreateNewClientDiscountWithFactory() {
        DiscountStrategy strategy =
                DiscountFactory.createDiscountStrategy(UserType.New);

        assertInstanceOf(NewClientDiscount.class, strategy);
    }

    @Test
    void shouldCreateFrequentClientDiscountWithFactory() {
        DiscountStrategy strategy =
                DiscountFactory.createDiscountStrategy(UserType.Frequent);

        assertInstanceOf(FrequentClientDiscount.class, strategy);
    }
}

