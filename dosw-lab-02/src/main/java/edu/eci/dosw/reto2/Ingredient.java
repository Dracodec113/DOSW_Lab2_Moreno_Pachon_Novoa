package edu.eci.dosw.reto2;

public class Ingredient {

    private String name;
    private double price;
    private IngredientCategory category;

    public Ingredient(String name, double price, IngredientCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public IngredientCategory getCategory() {
        return category;
    }
}