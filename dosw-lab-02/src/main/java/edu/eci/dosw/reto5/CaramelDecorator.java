package edu.eci.dosw.reto5;

public class CaramelDecorator extends CoffeDecorator {

    public CaramelDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public String getDescription(){
        return coffe.getDescription() + ", caramel";
    }

    @Override
    public double getPrice(){
        return coffe.getPrice() + ", 1200";
    }
}