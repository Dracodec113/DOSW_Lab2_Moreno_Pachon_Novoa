package edu.eci.dosw.reto3;

public class Challenge3KingdomOfVehicles {

    public static void run() {

        VehicleDirector director = new VehicleDirector();

        Store store = new Store();

        Vehicle car = director.createVehicle(
                "Land",
                "Luxury",
                "Car"
        );

        Vehicle motorcycle = director.createVehicle(
                "Land",
                "Economy",
                "Motorcycle"
        );

        Vehicle helicopter = director.createVehicle(
                "Air",
                "Used",
                "Helicopter"
        );

        store.addVehicle(car);
        store.addVehicle(motorcycle);
        store.addVehicle(helicopter);

        System.out.println("KINGDOM OF VEHICLES ");

        store.getVehicles()
                .forEach(vehicle -> System.out.println(
                        vehicle.getSummary()
                ));

        System.out.println(
                "Total: " + store.calculateTotal()
        );
    }
}