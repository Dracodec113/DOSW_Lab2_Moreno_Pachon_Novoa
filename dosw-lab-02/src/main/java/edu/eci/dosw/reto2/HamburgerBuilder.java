package edu.eci.dosw.reto2;

import java.util.ArrayList;
import java.util.List;

public class HamburgerBuilder {

    private List<Ingredient> ingredients;

    public HamburgerBuilder() {
        this.ingredients = new ArrayList<>();
    }

    public HamburgerBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public Hamburger build() {
        return new Hamburger(ingredients);
    }
}