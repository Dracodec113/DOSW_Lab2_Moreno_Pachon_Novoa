package edu.eci.dosw.reto5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for MintDecorator class in main
 */

public class MintDecoratorTest{
        @Test 
    public void shouldPrepareCaramelCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        MintDecorator mintCoffee = new MintDecorator(coffee);
        assertEquals("Traditional coffee, mint", mintCoffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        MintDecorator mintCoffee = new MintDecorator(coffee);
        assertEquals(1302.5, mintCoffee.getPrice());
    }  
}