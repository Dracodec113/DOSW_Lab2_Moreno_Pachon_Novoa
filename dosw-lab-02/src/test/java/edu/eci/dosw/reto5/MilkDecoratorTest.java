package edu.eci.dosw.reto5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for MilkDecorator class in main
 */

public class MilkDecoratorTest{
        @Test 
    public void shouldPrepareCaramelCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        MilkDecorator milkCoffee = new MilkDecorator(coffee);
        assertEquals("Traditional coffee, milk", milkCoffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        MilkDecorator milkCoffee = new MilkDecorator(coffee);
        assertEquals(1302.5, milkCoffee.getPrice());
    }  
}