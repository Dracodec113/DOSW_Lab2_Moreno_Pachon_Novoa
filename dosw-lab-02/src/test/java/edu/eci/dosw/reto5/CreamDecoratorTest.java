package edu.eci.dosw.reto5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for CreamDecorator class in main
 */

public class CreamDecoratorTest{
        @Test 
    public void shouldPrepareCaramelCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CreamDecorator creamCoffee = new CreamDecorator(coffee);
        assertEquals("Traditional coffee, Cream", creamCoffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CreamDecorator creamCoffee = new CreamDecorator(coffee);
        assertEquals(2002.5, creamCoffee.getPrice());
    }  
}