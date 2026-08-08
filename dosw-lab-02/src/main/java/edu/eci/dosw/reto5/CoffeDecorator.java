package edu.eci.dosw.reto5;

public abstract class CoffeDecorator implements Coffe {
    protected Coffe coffe;

    public CoffeDecorator(Coffe coffe){
        this.coffe = coffe;
    }

    @Override
    public String getDescription(){
        return coffe.getDescription();
    }

    @Override
    public double getPrice(){
        return coffe.getPrice();
    }
}