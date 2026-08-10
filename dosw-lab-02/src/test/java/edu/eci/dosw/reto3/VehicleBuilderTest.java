package edu.eci.dosw.reto3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class VehicleBuilderTest {

    @Test
    void shouldBuildLuxuryCarCorrectly() {

        Vehicle vehicle = new VehicleBuilder()
                .setFamily("Land")
                .setCategory("Luxury")
                .setModel("Car")
                .setMaxSpeed(180)
                .setBasePrice(20000)
                .addEquipment("Air conditioning")
                .build();

        assertNotNull(vehicle);
        assertEquals("Car", vehicle.getModel());
        assertEquals("Land", vehicle.getFamily());
        assertEquals("Luxury", vehicle.getCategory());
        assertEquals(252.0, vehicle.getMaxSpeed());
        assertEquals(32000.0, vehicle.getPrice());
    }
}