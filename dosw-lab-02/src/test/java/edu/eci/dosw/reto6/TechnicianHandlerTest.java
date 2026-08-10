package edu.eci.dosw.reto6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TechnicianHandlerTest {

    @Test
    void shouldBeResolvedByFirstTechnician() {

        Technician basic = new Technician(
                "Ana",
                Difficulty.BASIC,
                Priority.LOW
        );

        Technician intermediate = new Technician(
                "Carlos",
                Difficulty.INTERMEDIATE,
                Priority.MEDIUM
        );

        Technician advanced = new Technician(
                "Pedro",
                Difficulty.ADVANCED,
                Priority.HIGH
        );

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        Ticket ticket = new Ticket(
                "Simple computer problem",
                Difficulty.BASIC,
                Priority.LOW
        );

        basic.handle(ticket);

        assertTrue(ticket.isResolved());

        assertEquals(
                "Ana",
                ticket.getResolvedBy()
        );
    }

    @Test
    void shouldPassThroughSeveralTechnicians() {

        Technician basic = new Technician(
                "Ana",
                Difficulty.BASIC,
                Priority.LOW
        );

        Technician intermediate = new Technician(
                "Carlos",
                Difficulty.INTERMEDIATE,
                Priority.MEDIUM
        );

        Technician advanced = new Technician(
                "Pedro",
                Difficulty.ADVANCED,
                Priority.HIGH
        );

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        Ticket ticket = new Ticket(
                "Advanced server problem",
                Difficulty.ADVANCED,
                Priority.HIGH
        );

        basic.handle(ticket);

        assertTrue(ticket.isResolved());

        assertEquals(
                "Pedro",
                ticket.getResolvedBy()
        );

        assertEquals(
                3,
                ticket.getTechniciansVisited().size()
        );
    }
}