package edu.eci.dosw.reto3;

public class RequestReader {

    private String family;
    private String category;
    private String model;

    public RequestReader(String family, String category, String model) {
        this.family = family;
        this.category = category;
        this.model = model;
    }

    public String getFamily() {
        return family;
    }

    public String getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }
}
