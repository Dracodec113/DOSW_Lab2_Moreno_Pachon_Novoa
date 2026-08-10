package edu.eci.dosw.reto5;

public class CustomIngredientDecorator extends CoffeeDecorator {

    private String name;
    private double price;

    public CustomIngredientDecorator(Coffee coffee, String name, double price){
        super(coffee);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + ", " + name;
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + price;
    }
}