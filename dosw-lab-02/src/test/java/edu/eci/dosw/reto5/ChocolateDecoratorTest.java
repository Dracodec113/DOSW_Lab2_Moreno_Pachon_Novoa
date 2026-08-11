package edu.eci.dosw.reto5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for ChocolateDecorator in main class
 */

public class ChocolateDecoratorTest{
        @Test 
    public void shouldGetChocolateCoffeeDescription(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        ChocolateDecorator chocolateCoffee = new ChocolateDecorator(coffee);
        assertEquals("Traditional coffee, chocolate", chocolateCoffee.getDescription());
    }

    @Test public void shouldGetChocolateCoffeePrice(){
        Coffee coffee = new BasicCoffee("Traditional coffee", 2.5);
        ChocolateDecorator chocolateCoffee = new ChocolateDecorator(coffee);
        assertEquals(1502.5, chocolateCoffee.getPrice());
    }  
}