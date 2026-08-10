import java.util.List;

/**
 * Enumerator that defines the actual possible categories for the
 *  vehicles and its features
 */

public enum Category{
    ECONOMY(1.0, "Standard", List.of("Air-conditioning", "GPS"), 1.1),
    LUXURY(1.6, "High", List.of("FM/AM Radio", "Digital Screen", "Advanced GPS"), 1.4),
    USED(0.8, "Basic", List.of("FM Radio"), 0.8);

    private double pricePercentage;
    private String comfortLevel;
    private List<String> extraEquipment;
    private double speedPercentage;

    private Category(double pricePercentage, String comfortLevel, List<String> extraEquipment, double speedPercentage){
        this.pricePercentage = pricePercentage;
        this.comfortLevel = comfortLevel;
        this.extraEquipment = extraEquipment;
        this.speedPercentage = speedPercentage;
    }

    public double calculatePrice(double iniPrice){
        return iniPrice * this.pricePercentage;
    }

    public double calculateMaxSpeed(double iniMaxSpeed){
        return iniMaxSpeed * this.speedPercentage;
    }

    public String getComfortLevel(){
        return this.comfortLevel();
    }

    public List<String> getExtraEquipment(){
        return this.extraEquipment;
    }
}