package edu.eci.dosw.reto6;

import java.util.Map;

public record TicketStats(Map<Difficulty,Long> byDifficulty, long resolvedCount, long pendingCount,double avgPriorityResolved) {}
