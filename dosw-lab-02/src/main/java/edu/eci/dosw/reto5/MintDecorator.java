package edu.eci.dosw.reto5;

public class MintDecorator extends CoffeDecorator {

    public MintDecorator(Coffe coffe){
        super(coffe);
    }

    @Override
    public String getDescription(){
        return coffe.getDescription() + ", mint";
    }

    @Override
    public double getPrice(){
        return coffe.getPrice() + ", 1300";
    }
}