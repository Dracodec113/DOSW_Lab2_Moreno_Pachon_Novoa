package edu.eci.dosw.reto3;

public class VehicleDirector {

    public Vehicle createVehicle(String family, String category, String model) {

        VehicleBuilder builder = new VehicleBuilder();

        switch (family.toUpperCase()) {
            case "LAND":
                builder.setFamily("Land");
                break;

            case "WATER":
                builder.setFamily("Water");
                break;

            case "AIR":
                builder.setFamily("Air");
                break;

            default:
                throw new IllegalArgumentException("Invalid family");
        }

        switch (category.toUpperCase()) {
            case "ECONOMY":
                builder.setCategory("Economy");
                break;

            case "LUXURY":
                builder.setCategory("Luxury");
                break;

            case "USED":
                builder.setCategory("Used");
                break;

            default:
                throw new IllegalArgumentException("Invalid category");
        }

        switch (model.toUpperCase()) {

            case "CAR":
                builder.setModel("Car")
                       .setMaxSpeed(180)
                       .setBasePrice(20000)
                       .addEquipment("Air conditioning");
                break;

            case "BICYCLE":
                builder.setModel("Bicycle")
                       .setMaxSpeed(30)
                       .setBasePrice(400)
                       .addEquipment("Helmet");
                break;

            case "MOTORCYCLE":
                builder.setModel("Motorcycle")
                       .setMaxSpeed(140)
                       .setBasePrice(8000)
                       .addEquipment("Safety equipment");
                break;

            case "MOTORBOAT":
                builder.setModel("Motorboat")
                       .setMaxSpeed(70)
                       .setBasePrice(35000)
                       .addEquipment("Life jacket");
                break;

            case "SAILBOAT":
                builder.setModel("Sailboat")
                       .setMaxSpeed(35)
                       .setBasePrice(50000)
                       .addEquipment("Flare kit");
                break;

            case "JET SKI":
                builder.setModel("Jet Ski")
                       .setMaxSpeed(90)
                       .setBasePrice(12000)
                       .addEquipment("Safety equipment");
                break;

            case "AIRPLANE":
                builder.setModel("Airplane")
                       .setMaxSpeed(900)
                       .setBasePrice(1500000)
                       .addEquipment("Radar");
                break;

            case "LIGHT AIRCRAFT":
                builder.setModel("Light Aircraft")
                       .setMaxSpeed(250)
                       .setBasePrice(180000)
                       .addEquipment("Parachutes");
                break;

            case "HELICOPTER":
                builder.setModel("Helicopter")
                       .setMaxSpeed(260)
                       .setBasePrice(850000)
                       .addEquipment("Drone equipment");
                break;

            default:
                throw new IllegalArgumentException("Invalid model");
        }

        return builder.build();
    }
}