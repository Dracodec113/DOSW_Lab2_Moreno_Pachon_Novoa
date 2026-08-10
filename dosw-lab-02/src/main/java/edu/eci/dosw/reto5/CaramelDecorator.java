package edu.eci.dosw.reto5;

public class CaramelDecorator extends CoffeeDecorator {

    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", caramel";
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + 1200;
    }
}