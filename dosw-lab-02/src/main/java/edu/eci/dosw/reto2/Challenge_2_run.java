package edu.eci.dosw.reto2;

public final class Challenge_2_run {

    private Challenge_2_run() {}

    public static void run() {
        System.out.println("Running Challenge 2 — Five-Star Chef...");

        Hamburger classic = new HamburgerBuilder()
                .addIngredient(new Ingredient("Pan brioche", 2000, IngredientCategory.BREAD))
                .addIngredient(new Ingredient("Carne de res", 8000, IngredientCategory.MEAT))
                .addIngredient(new Ingredient("Queso cheddar", 3000, IngredientCategory.CHEESE))
                .addIngredient(new Ingredient("Lechuga", 1000, IngredientCategory.VEGETABLE))
                .build();

        Hamburger gourmet = new HamburgerBuilder()
                .addIngredient(new Ingredient("Pan brioche", 2000, IngredientCategory.BREAD))
                .addIngredient(new Ingredient("Doble carne", 15000, IngredientCategory.MEAT))
                .addIngredient(new Ingredient("Queso cheddar", 3000, IngredientCategory.CHEESE))
                .addIngredient(new Ingredient("Tocineta", 4000, IngredientCategory.EXTRA))
                .addIngredient(new Ingredient("Salsa BBQ", 1500, IngredientCategory.SAUCE))
                .build();

        System.out.println(classic.getSummary());
        System.out.println(gourmet.getSummary());
    }
}