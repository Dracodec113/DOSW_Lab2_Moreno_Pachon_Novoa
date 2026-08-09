package edu.eci.dosw.reto6;

public class Ticket {
    private final String description;
    private final Difficulty difficulty;
    private final Priority priority;
    private boolean resolved;
    private String resolvedBy;

    public Ticket(String description, Difficulty difficulty, Priority priority) {
        this.description = description;
        this.difficulty = difficulty;
        this.priority = priority;
        this.resolved = false;
        this.resolvedBy = null;
    }

    public String getDescription() { return description; }
    public Difficulty getDifficulty() { return difficulty; }
    public Priority getPriority() { return priority; }
    public boolean isResolved() { return resolved; }
    public String getResolvedBy() { return resolvedBy; }

    public void markResolved(String technicianName) {
        this.resolved = true;
        this.resolvedBy = technicianName;
    }
}