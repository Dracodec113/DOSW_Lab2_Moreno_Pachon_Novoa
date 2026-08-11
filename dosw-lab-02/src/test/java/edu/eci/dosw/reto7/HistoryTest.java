package edu.eci.dosw.reto7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HistoryTest {

    @Test
    void shouldSaveUserAndActionInHistory() {

        Door door = new Door("Main door");

        DoorCommandAction command = new DoorCommandAction(door, true);

        History history = new History("Paula", false, command);

        assertEquals("Paula", history.getUser());
        assertFalse(history.getUndone());
        assertEquals("Open the door", history.commandName());
        assertEquals("DOOR", history.getCommand().getDeviceInvolved());
    }

    @Test
    void shouldMarkActionAsUndone() {

        Door door = new Door("Main door");

        DoorCommandAction command = new DoorCommandAction(door, true);

        History history = new History("Paula", false, command);

        assertFalse(history.getUndone());

        history.markUndone();

        assertTrue(history.getUndone());
    }
}