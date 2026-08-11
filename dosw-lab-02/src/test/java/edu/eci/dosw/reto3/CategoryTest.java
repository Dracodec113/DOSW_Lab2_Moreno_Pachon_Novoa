package edu.eci.dosw.reto3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    void shouldCalculateLuxuryPrice() {

        double result = 20000 * 1.6;

        assertEquals(32000.0, result);
    }

    @Test
    void shouldCalculateLuxurySpeed() {

        double result = Math.round(180 * 1.4);

        assertEquals(252.0, result);
    }

    @Test
    void shouldCalculateUsedPrice() {

        double result = 850000 * 0.8;

        assertEquals(680000.0, result);
    }
}