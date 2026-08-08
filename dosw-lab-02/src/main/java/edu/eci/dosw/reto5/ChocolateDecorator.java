package edu.eci.dosw.reto5;

public class ChocolateDecorator extends CoffeDecorator {

    public ChocolateDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public String getDescription(){
        return coffe.getDescription() + ", chocolate";
    }

    @Override
    public double getPrice(){
        return coffe.getPrice() + ", 1500";
    }
    
}