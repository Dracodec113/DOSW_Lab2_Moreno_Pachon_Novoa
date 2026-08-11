package edu.eci.dosw.reto6;

public enum Difficulty {

    BASIC(1),
    INTERMEDIATE(2),
    ADVANCED(3);

    private final int level;

    Difficulty(int level) {
        this.level = level;
    }

    public int level() {
        return level;
    }
}