package edu.eci.dosw.reto3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class VehicleDirectorTest {

    @Test
    void shouldCreateLuxuryCar() {

        VehicleDirector director = new VehicleDirector();

        Vehicle vehicle = director.createVehicle(
                "Land",
                "Luxury",
                "Car"
        );

        assertNotNull(vehicle);

        assertEquals("Land", vehicle.getFamily());
        assertEquals("Car", vehicle.getModel());
        assertEquals("Luxury", vehicle.getCategory());

        assertEquals(252.0, vehicle.getMaxSpeed());
        assertEquals(32000.0, vehicle.getPrice());
    }

    @Test
    void shouldCreateUsedHelicopter() {

        VehicleDirector director = new VehicleDirector();

        Vehicle vehicle = director.createVehicle(
                "Air",
                "Used",
                "Helicopter"
        );

        assertNotNull(vehicle);

        assertEquals("Air", vehicle.getFamily());
        assertEquals("Helicopter", vehicle.getModel());
        assertEquals("Used", vehicle.getCategory());

        assertEquals(208.0, vehicle.getMaxSpeed());
        assertEquals(680000.0, vehicle.getPrice());
    }
}