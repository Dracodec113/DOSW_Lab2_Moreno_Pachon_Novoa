import java.util.Locale.Category;

/**
 * Vehicle class that implements that includes all the vehicles features and the 
 * needed methods to obtain its information.
 */

public class Vehicle{
    ///Type.Category.Maximum speed.Price.Special equipment.
    private Category category;
    private FamilyType family;
    private String model;
    private double maxSpeed;
    private double price;
    private List<String> equipment;

    public String getFamily(){
        return this.family;
    }

    public Category getCategory(){
        return this.category;
    }

    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public double getPrice(){
        return this.price;
    }

    public String getSpecialEquipment(){
        return this.category.getExtraEquipment().toString();
    }
}