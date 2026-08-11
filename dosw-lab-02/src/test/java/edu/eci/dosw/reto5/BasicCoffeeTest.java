package edu.eci.dosw.reto5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for BasicCoffee class in main
 */

public class BasicCoffeeTest{
    
    @Test
    public void shouldPrepareBasicCoffee(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        assertEquals("Traditional coffee", coffee.getDescription());
        assertEquals(2.5, coffee.getPrice(), 0.001);
    }

    @Test 
    public void shouldGetDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        assertEquals("Traditional coffee", coffee.getDescription());
    }

    @Test public void shouldGetPrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        assertEquals(2.5, coffee.getPrice());
    }

}