package edu.eci.dosw.reto5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for CaramelDecorator class in main
 */

public class CaramelDecoratorTest{

    @Test 
    public void shouldPrepareCaramelCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CaramelDecorator caramelCoffee = new CaramelDecorator(coffee);
        assertEquals("Traditional coffee, caramel", caramelCoffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        CaramelDecorator caramelCoffee = new CaramelDecorator(coffee);
        assertEquals(1202.5, caramelCoffee.getPrice());
    }   
}