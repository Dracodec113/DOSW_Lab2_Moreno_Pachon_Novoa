package edu.eci.dosw.reto7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LightCommandActionTest {

    @Test
    void shouldTurnLightOnAndUndoAction() {

        Light light = new Light("Living room light");

        LightCommandAction command = new LightCommandAction(light, true);

        command.execute();

        assertTrue(light.isOn());

        command.setPastState();

        assertFalse(light.isOn());
    }

    @Test
    void shouldTurnLightOffAndUndoAction() {

        Light light = new Light("Living room light");

        light.setOn(true);

        LightCommandAction command = new LightCommandAction(light, false);

        command.execute();

        assertFalse(light.isOn());

        command.setPastState();

        assertTrue(light.isOn());
    }
}