package edu.eci.dosw.reto3;

import java.util.List;

public class Vehicle {

    private String family;
    private String category;
    private String model;
    private double maxSpeed;
    private double price;
    private List<String> equipment;

    public Vehicle(
            String family,
            String category,
            String model,
            double maxSpeed,
            double price,
            List<String> equipment) {

        this.family = family;
        this.category = category;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.equipment = equipment;
    }

    public String getFamily() {
        return family;
    }

    public String getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public String getSummary() {
        return "Model: " + model
                + " | Family: " + family
                + " | Category: " + category
                + " | Max speed: " + maxSpeed
                + " | Price: " + price
                + " | Equipment: " + equipment;
    }
}