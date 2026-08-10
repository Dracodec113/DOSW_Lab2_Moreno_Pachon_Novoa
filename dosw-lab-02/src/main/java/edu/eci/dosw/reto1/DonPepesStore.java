package edu.eci.dosw.reto1;

public final class DonPepesStore {

    private DonPepesStore() {
    }

    public static void run() {

        System.out.println("Running Challenge 1 - Don Pepe's Store...");


        Client client = new Client("Juan", UserType.Frequent);

        DiscountStrategy strategy = DiscountFactory.createDiscountStrategy(UserType.Frequent);

        ShoppingCart cart = new ShoppingCart(client, strategy);

        cart.addItem(new Product("T-shirt", 20000), 2);
        // cart.addItem(new Product("Pants", 50000), 1);
        cart.addItem(new Product("Cookies", 500), 3);
        cart.addItem(new Product("Natural Juice", 3000), 5);
        Receipt receipt = cart.checkout();
        System.out.println(receipt.receiptCreation());

    }
}