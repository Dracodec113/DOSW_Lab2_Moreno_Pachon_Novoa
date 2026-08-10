package edu.eci.dosw.reto3;

import java.util.List;

public class Category {

    private String name;
    private double pricePercentage;
    private String comfortLevel;
    private List<String> extraEquipment;
    private double speedPercentage;

    public Category(
            String name,
            double pricePercentage,
            String comfortLevel,
            List<String> extraEquipment,
            double speedPercentage) {

        this.name = name;
        this.pricePercentage = pricePercentage;
        this.comfortLevel = comfortLevel;
        this.extraEquipment = extraEquipment;
        this.speedPercentage = speedPercentage;
    }

    public double calculatePrice(double basePrice) {
        return basePrice * pricePercentage;
    }

    public double calculateMaxSpeed(double baseSpeed) {
    return Math.round(baseSpeed * speedPercentage);
    }

    public String getName() {
        return name;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }

    public List<String> getExtraEquipment() {
        return extraEquipment;
    }
}