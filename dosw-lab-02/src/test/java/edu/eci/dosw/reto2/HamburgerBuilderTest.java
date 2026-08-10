package edu.eci.dosw.reto2;

import static org.junit.jupiter.api.Assertions.assertEquals; //Preguntar por qué importación estática.
import org.junit.jupiter.api.Test; 

class HamburgerBuilderTest {

    @Test
    void buildShouldContainAllAddedIngredientsInOrder() {
        Ingredient bread = new Ingredient("Pan", 2000, IngredientCategory.BREAD);
        Ingredient meat = new Ingredient("Carne", 8000, IngredientCategory.MEAT);

        Hamburger hamburger = new HamburgerBuilder()
                .addIngredient(bread)
                .addIngredient(meat)
                .build();

        assertEquals(2, hamburger.getIngredients().size());
        assertEquals(bread, hamburger.getIngredients().get(0));
        assertEquals(meat, hamburger.getIngredients().get(1));
    }
}