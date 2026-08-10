import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that acts as a vehicle builder according to each vehicle specific conditions.
 */

enum FamilyType {LAND, WATER, AIR};

public class VehicleBuilder{
    private String model;
    private FamilyType family;
    private Category category;
    private double maxSpeed;
    private double iniPrice;
    private List<String> equipment = new ArrayList<>();

    public VehicleBuilder setPrice(double price){
        this.iniPrice = price;
        return this;
    }

    public VehicleBuilder setModel(String model){
        this.model = model;
        return this;
    }

    public VehicleBuilder setCategory(Category category){
        this.category = category;
        return this;
    }

    public VehicleBuilder setMaxSpeed(double speed){
        this.maxSpeed = speed;
    }

    public VehicleBuilder setFamily(FamilyType family){
        this.family = family;
        return this;
    }

    public VehicleBuilder setEquipment(String stuff){
        this.equipment.add(stuff);
        return this;
    }

    public Vehicle build() {
        List<String> finalEquipment = new ArrayList<>(category.getDefaultEquipment());
        finalEquipment.addAll(this.extraEquipment);

        DecimalFormat df = new DecimalFormat("#.0000");

        return new Vehicle(
            category,
            family,
            model,
            df.format(category.calculateMaxSpeed(maxSpeed)),
            df.format(category.calculatePrice(iniPrice)),
            finalEquipment);
    }
}