package edu.eci.dosw.reto6;

public abstract class TechnicianHandler {
    private final String name;
    private final Difficulty specialty;
    private final Priority maxPriority;
    private TechnicianHandler next;

    protected TechnicianHandler(String name, Difficulty specialty, Priority maxPriority) {
        this.name = name;
        this.specialty = specialty;
        this.maxPriority = maxPriority;
    }

    public void setNext(TechnicianHandler next) {
        this.next = next;
    }

    public void handle(Ticket ticket) {
        ticket.addTechnicianVisited(this.name);
        
        if (canHandle(ticket)) {
            ticket.markResolved(this.name);
        } else if (next != null) {
            next.handle(ticket);
        }
    }

    protected boolean canHandle(Ticket ticket) {

    boolean difficultyAllowed =
            ticket.getDifficulty().level()
            <= this.specialty.level();

    boolean priorityAllowed =
            ticket.getPriority().level()
            <= this.maxPriority.level();

    return difficultyAllowed && priorityAllowed;
    }

    public String getName() { 
        return name; 
    }

    public Difficulty getSpecialty() { 
        return specialty; 
    }
}