package edu.eci.dosw.reto5;

public class MintDecorator extends CoffeeDecorator {

    public MintDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", mint";
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + 1300;
    }
}