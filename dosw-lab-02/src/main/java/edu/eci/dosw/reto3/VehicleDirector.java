import java.util.Locale.Category;

/**
 * Class that defines how to construct the vehicle
 */

public class VehicleDirector{
    public Vehicle createVehicle(String family, String model, String category){
        VehicleBuilder builder1 = new VehicleBuilder()
            .setModel(model);
        
        switch (family.toUpperCase()) {
            case "LAND":
                builder1.setFamily(FamilyType.LAND);
                break;
            case "AIR":
                builder1.setFamily(FamilyType.AIR);
                break;
            case "WATER":
                builder1.setFamily(FamilyType.WATER);
                break;
            default:
                builder1.setFamily(FamilyType.LAND);
                break;
        }

        switch (Category.toUpperCase()) {
            case "ECONOMY":
                builder1.setCategory(Category.ECONOMY);
                break;
            case "LUXURY":
                builder1.setCategory(Category.LUXURY);
                break;
            case "USED":
                builder1.setCategory(Category.USED);
                break;
            default:
                builder1.setCategory(Category.ECONOMY);
                break;
        }


        switch (model.toUpperCase()) {
            case "CAR": 
                builder.setMaxSpeed(180)
                    .setBasePrice(20000.0)
                    .addEquipment("Clean Glasses");
                break;
            case "BICYCLE":
                builder.setMaxSpeed(30)
                    .setBasePrice(400.0)
                    .addEquipment("Replacement chair");
                break;
            case "MOTORCYCLE":
                builder.setMaxSpeed(140)
                    .setBasePrice(8000.0)
                    .addEquipment("Safe-deposit box");
                break;
            case "MOTORBOAT":
                builder.setMaxSpeed(70)
                    .setBasePrice(35000.0)
                    .addEquipment("Life jacket");
                break;
            case "SAILBOAT":
                builder.setMaxSpeed(35)
                    .setBasePrice(50000.0)
                    .addEquipment("Flare kit");
                break;
            case "JET_SKI":
                builder.setMaxSpeed(90)
                    .setBasePrice(12000.0)
                    .addEquipment("Ski board");
                break;
            case "AIRPLANE":
                builder.setMaxSpeed(900)
                    .setBasePrice(1500000.0)
                    .addEquipment("Radar");
                break;
            case "LIGHT_AIRCRAFT":
                builder.setMaxSpeed(250)
                    .setBasePrice(180000.0)
                    .addEquipment("Two parachutes");
                break;
            case "HELICOPTER":
                builder.setMaxSpeed(260)
                    .setBasePrice(850000.0)
                    .addEquipment("Basic drone set");
                break;
            default:
                builder.setMaxSpeed(0)
                    .setBasePrice(0)
                    .addEquipment("---");
        }

        // Construye y retorna el Vehicle resultante
        return builder1.build();


    }
}