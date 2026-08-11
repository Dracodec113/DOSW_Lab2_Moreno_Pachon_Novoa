package edu.eci.dosw.reto5;

import java.util.List;

public class CustomizedCoffee {
    private CustomizedCoffee() {}

    public static void run() {
        System.out.println("Running Challenge 5 - Customized Coffee...");

        Coffee coffee1 = new ChocolateDecorator(
                new CreamDecorator(
                new BasicCoffee("Coffee", 5000)));

        Coffee coffee2 = new MintDecorator(
            new CaramelDecorator(
            new CustomIngredientDecorator(
            new BasicCoffee("Coffee", 5000),"Honey", 1000)));

        List<Coffee> coffees = List.of(coffee1, coffee2);

        coffees.forEach(coffee ->
                System.out.println(coffee.getDescription() + " COP " + coffee.getPrice()));

        double totalAllCoffees = coffees.stream()
                .mapToDouble(Coffee::getPrice)
                .sum();

        System.out.println("Total de todos los cafés: COP " + totalAllCoffees);
    }
}
