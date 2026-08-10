package edu.eci.dosw.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public final class TalkToTechnicalSupport {

    private TalkToTechnicalSupport() {
    }

    public static void run() {

        // 1. CREATE THE TECHNICIANS

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

        // 2. CREATE THE CHAIN OF RESPONSIBILITY

        basic.setNext(intermediate);
        intermediate.setNext(advanced);


        // 3. CREATE THE TICKET LIST

        List<Ticket> tickets = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("   TECHNICAL SUPPORT SYSTEM");
        System.out.println("================================");

        // 4. ASK THE USER FOR TICKETS

        boolean continueAdding = true;

        while (continueAdding) {

            System.out.println("\nEnter ticket description:");
            String description = scanner.nextLine();

            // Select difficulty

            System.out.println("\nSelect difficulty:");
            System.out.println("1. Basic");
            System.out.println("2. Intermediate");
            System.out.println("3. Advanced");

            int difficultyOption =
                    Integer.parseInt(scanner.nextLine());

            Difficulty difficulty;

            switch (difficultyOption) {

                case 1:
                    difficulty = Difficulty.BASIC;
                    break;

                case 2:
                    difficulty = Difficulty.INTERMEDIATE;
                    break;

                case 3:
                    difficulty = Difficulty.ADVANCED;
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Invalid difficulty"
                    );
            }

            // Select priority

            System.out.println("\nSelect priority:");
            System.out.println("1. Low");
            System.out.println("2. Medium");
            System.out.println("3. High");

            int priorityOption =
                    Integer.parseInt(scanner.nextLine());

            Priority priority;

            switch (priorityOption) {

                case 1:
                    priority = Priority.LOW;
                    break;

                case 2:
                    priority = Priority.MEDIUM;
                    break;

                case 3:
                    priority = Priority.HIGH;
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Invalid priority"
                    );
            }


            // Create the ticket

            Ticket ticket = new Ticket(
                    description,
                    difficulty,
                    priority
            );

            tickets.add(ticket);

            // Ask if the user wants another ticket

            System.out.println(
                    "\nDo you want to add another ticket? (yes/no)"
            );

            String answer = scanner.nextLine();

            continueAdding =
                    answer.equalsIgnoreCase("yes");
        }


        // 5. PROCESS ALL TICKETS


        for (Ticket ticket : tickets) {

            // Start the chain with the first technician
            basic.handle(ticket);


            System.out.println("\n--------------------------------");
            System.out.println(
                    "Ticket: " + ticket.getDescription()
            );

            System.out.println(
                    "Difficulty: " + ticket.getDifficulty()
            );

            System.out.println(
                    "Priority: " + ticket.getPriority()
            );

            System.out.println(
                    "Technicians visited: "
                    + ticket.getTechniciansVisited()
            );


            // Show who resolved the ticket

            if (ticket.isResolved()) {

                System.out.println(
                        "Resolved by: "
                        + ticket.getResolvedBy()
                );

            } else {

                System.out.println(
                        "Status: Pending escalation"
                );
            }


            // Check if the ticket passed through
            // more than one technician

            if (ticket.getTechniciansVisited().size() > 1) {

                System.out.println(
                        "This ticket passed through multiple technicians."
                );
            }
        }

        // 6. STATISTICS USING JAVA STREAMS

        // number of tickets for each difficulty
        Map<Difficulty, Long> byDifficulty =
                tickets.stream()
                        .collect(
                                Collectors.groupingBy(
                                        ticket -> ticket.getDifficulty(),
                                        Collectors.counting()
                                )
                        );


        // number of resolved tickets
        long resolvedCount =
                tickets.stream()
                        .filter(ticket -> ticket.isResolved())
                        .count();


        // number of pending tickets
        long pendingCount =
                tickets.stream()
                        .filter(ticket -> !ticket.isResolved())
                        .count();


        // average priority of resolved tickets
        double avgPriorityResolved =
                tickets.stream()
                        .filter(ticket -> ticket.isResolved())
                        .mapToInt(
                                ticket -> ticket.getPriority().level()
                        )
                        .average()
                        .orElse(0.0);


        // 7. CREATE THE STATISTICS OBJECT

        TicketStats stats = new TicketStats(
                byDifficulty,
                resolvedCount,
                pendingCount,
                avgPriorityResolved
        );


        // 8. DISPLAY FINAL STATISTICS

        System.out.println("        FINAL STATISTICS");
        System.out.println("================================");

        System.out.println(
                "Tickets by difficulty: "
                + stats.byDifficulty()
        );

        System.out.println(
                "Resolved tickets: "
                + stats.resolvedCount()
        );

        System.out.println(
                "Pending tickets: "
                + stats.pendingCount()
        );

        System.out.println(
                "Average priority of resolved tickets: "
                + stats.avgPriorityResolved()
        );


        scanner.close();
    }
}