package edu.eci.dosw.reto5;

public class BasicCoffe implements Coffe {
    private String description;
    private double price; 

    public BasicCoffe(String description, double price){
        this.description = description;
        this.price = price; 
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double getPrice(){
        return price; 
    }


}