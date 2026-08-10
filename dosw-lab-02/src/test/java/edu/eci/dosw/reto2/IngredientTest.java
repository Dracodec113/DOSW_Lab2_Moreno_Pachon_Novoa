package edu.eci.dosw.reto2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IngredientTest {

    @Test
    void constructorShouldSetAllFieldsCorrectly() {
        Ingredient ingredient = new Ingredient("Queso", 3000, IngredientCategory.CHEESE);

        assertEquals("Queso", ingredient.getName());
        assertEquals(3000, ingredient.getPrice());
        assertEquals(IngredientCategory.CHEESE, ingredient.getCategory());
    }
}