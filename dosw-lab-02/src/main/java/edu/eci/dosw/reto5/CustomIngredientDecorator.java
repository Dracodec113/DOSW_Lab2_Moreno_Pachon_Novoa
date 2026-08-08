package edu.eci.dosw.reto5;

public class CustomIngredientDecorator extends CoffeDecorator {

    private String name;
    private double price;

    public CustomIngredientDecorator(Coffe coffe, String name, double price){
        super(coffe);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription(){
        return coffe.getDescription() + ", " + name;
    }

    @Override
    public double getPrice(){
        return coffe.getprice() + ", " + price;
    }
}