package edu.eci.dosw.reto5;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription();
    }

    @Override
    public double getPrice(){
        return coffee.getPrice();
    }
}