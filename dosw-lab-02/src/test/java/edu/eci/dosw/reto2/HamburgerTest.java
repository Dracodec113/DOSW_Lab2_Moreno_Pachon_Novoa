package edu.eci.dosw.reto2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HamburgerTest {

    @Test
    void calculatePriceShouldSumAllIngredients() {
        Hamburger hamburger = new HamburgerBuilder()
                .addIngredient(new Ingredient("Pan", 2000, IngredientCategory.BREAD))
                .addIngredient(new Ingredient("Carne", 8000, IngredientCategory.MEAT))
                .addIngredient(new Ingredient("Queso", 3000, IngredientCategory.CHEESE))
                .build();

        assertEquals(13000, hamburger.calculatePrice());
    }
}