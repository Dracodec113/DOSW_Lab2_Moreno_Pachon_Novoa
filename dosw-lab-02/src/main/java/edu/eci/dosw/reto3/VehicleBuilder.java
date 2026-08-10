package edu.eci.dosw.reto3;

import java.util.ArrayList;
import java.util.List;

public class VehicleBuilder {

    private String family;
    private String category;
    private String model;
    private double maxSpeed;
    private double basePrice;
    private List<String> equipment = new ArrayList<>();

    public VehicleBuilder setFamily(String family) {
        this.family = family;
        return this;
    }

    public VehicleBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public VehicleBuilder setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public VehicleBuilder setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public VehicleBuilder addEquipment(String equipment) {
        this.equipment.add(equipment);
        return this;
    }

    public Vehicle build() {

        double price = calculatePrice();
        double finalSpeed = calculateSpeed();

        return new Vehicle(
                family,
                category,
                model,
                finalSpeed,
                price,
                new ArrayList<>(equipment)
        );
    }

    private double calculatePrice() {

        if (category.equalsIgnoreCase("Luxury")) {
            return basePrice * 1.6;
        }

        if (category.equalsIgnoreCase("Used")) {
            return basePrice * 0.8;
        }

        return basePrice;
    }

    private double calculateSpeed() {

    double finalSpeed = maxSpeed;

    if (category.equalsIgnoreCase("Luxury")) {
        finalSpeed = maxSpeed * 1.4;
    }

    if (category.equalsIgnoreCase("Used")) {
        finalSpeed = maxSpeed * 0.8;
    }

    return Math.round(finalSpeed);
    }
}