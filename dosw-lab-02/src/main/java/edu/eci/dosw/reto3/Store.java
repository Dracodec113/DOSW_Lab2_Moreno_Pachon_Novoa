package edu.eci.dosw.reto3;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public double calculateTotal() {

    return vehicles.stream()
            .mapToDouble(vehicle -> vehicle.getPrice())
            .sum();
}
}