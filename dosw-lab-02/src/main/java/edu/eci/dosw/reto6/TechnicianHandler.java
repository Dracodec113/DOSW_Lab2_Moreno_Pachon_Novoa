package edu.eci.dosw.reto6;

public abstract class TechnicianHandler {
    private final String name;
    private final String specialty;
    private final Priority maxPriority;
    private TechnicianHandler next;

    protected TechnicianHandler(String name, String specialty, Priority maxPriority) {
        this.name = name;
        this.specialty = specialty;
        this.maxPriority = maxPriority;
    }

    public void setNext(TechnicianHandler next) {
        this.next = next;
    }

    public void handle(Ticket ticket) {
        if (canHandle(ticket)) {
            ticket.markResolved(this.name);
        } else if (next != null) {
            next.handle(ticket);
        }
    }

    protected boolean canHandle(Ticket ticket) {
        return ticket.getPriority().level() <= this.maxPriority.level();
    }

    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
}