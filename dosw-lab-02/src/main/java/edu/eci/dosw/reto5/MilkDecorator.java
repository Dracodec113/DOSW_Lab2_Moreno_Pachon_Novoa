package edu.eci.dosw.reto5;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", milk";
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + 1300;
    }
}