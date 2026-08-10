package edu.eci.dosw.reto2;

import java.util.List;
import java.util.stream.Collectors;

public class Hamburger {

    private final List<Ingredient> ingredients;

    public Hamburger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double calculatePrice() {
        return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
    }

    public String getSummary() {
        String names = ingredients.stream()
                .map(Ingredient::getName)
                .collect(Collectors.joining(", "));

        return "Hamburguesa personalizada con: " + names +
                "---Precio total: COP " + calculatePrice();
    }
}