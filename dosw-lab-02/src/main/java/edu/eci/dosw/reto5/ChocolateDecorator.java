package edu.eci.dosw.reto5;

public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", chocolate";
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + 1500;
    }
    
}