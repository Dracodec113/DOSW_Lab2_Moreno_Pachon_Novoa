package edu.eci.dosw.reto7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DoorCommandActionTest {

    @Test
    void shouldOpenDoorAndUndoAction() {

        Door door = new Door("Main door");

        DoorCommandAction command = new DoorCommandAction(door, true);

        command.execute();

        assertTrue(door.isOpen());

        command.setPastState();

        assertFalse(door.isOpen());
    }

    @Test
    void shouldCloseDoorAndUndoAction() {

        Door door = new Door("Main door");

        door.setOpen(true);

        DoorCommandAction command = new DoorCommandAction(door, false);

        command.execute();

        assertFalse(door.isOpen());

        command.setPastState();

        assertTrue(door.isOpen());
    }
}