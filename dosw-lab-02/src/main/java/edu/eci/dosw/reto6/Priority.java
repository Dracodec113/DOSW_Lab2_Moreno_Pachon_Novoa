package edu.eci.dosw.reto6;

public enum Priority {
    LOW(1), MEDIUM(2), HIGH(3);

    private final int level;
    Priority(int level) { this.level = level; }
    public int level() { return level; }
}
