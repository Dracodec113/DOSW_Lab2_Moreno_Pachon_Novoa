package edu.eci.dosw.reto5;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", Cream";
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + 2000;
    }
}