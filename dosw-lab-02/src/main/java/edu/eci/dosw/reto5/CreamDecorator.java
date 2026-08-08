package edu.eci.dosw.reto5;

public class CreamDecorator extends CoffeDecorator{

    public CreamDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public String getDescription(){
        return coffe.getDescription() + ", Cream";
    }

    @Override
    public double getPrice(){
        return coffe.getPrice() + ", 2000";
    }
}