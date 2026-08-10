package edu.eci.dosw.reto5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for CustomIngredientDecorator class in main
 */

public class CustomIngredientDecoratorTest{
        @Test 
    public void shouldPrepareCaramelCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CustomIngredientDecorator customIngredientCoffee = new CustomIngredientDecorator(coffee, "vanilla", 1000);
        assertEquals("Traditional coffee, vanilla", customIngredientCoffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CustomIngredientDecorator customIngredientCoffee = new CustomIngredientDecorator(coffee, "vanilla", 1000);
        assertEquals(1002.5, customIngredientCoffee.getPrice());
    }  
}