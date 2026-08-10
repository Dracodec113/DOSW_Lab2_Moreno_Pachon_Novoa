package edu.eci.dosw.reto6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    void shouldCreateTicketCorrectly() {

        Ticket ticket = new Ticket(
                "Computer does not turn on",
                Difficulty.BASIC,
                Priority.LOW
        );

        assertEquals(
                "Computer does not turn on",
                ticket.getDescription()
        );

        assertEquals(
                Difficulty.BASIC,
                ticket.getDifficulty()
        );

        assertEquals(
                Priority.LOW,
                ticket.getPriority()
        );

        // A new ticket must be pending
        assertFalse(ticket.isResolved());
    }

    @Test
    void shouldMarkTicketAsResolved() {

        Ticket ticket = new Ticket(
                "Internet connection problem",
                Difficulty.INTERMEDIATE,
                Priority.MEDIUM
        );

        ticket.markResolved("Carlos");

        // The ticket must now be resolved
        assertTrue(ticket.isResolved());

        // The system must remember who resolved it
        assertEquals(
                "Carlos",
                ticket.getResolvedBy()
        );
    }
}