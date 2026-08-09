package edu.eci.dosw.reto2;

import java.util.List;

public class Hamburger {

    private List<Ingredient> ingredients;

    public Hamburger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double calculatePrice() {
        return 0;
    }

    public String getSummary() {
        return "";
    }
}