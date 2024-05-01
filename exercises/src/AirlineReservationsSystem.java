import java.util.Scanner;

public class AirlineReservationsSystem {
    private static boolean[] seats = new boolean[11]; // Seats array (index 0 is not used)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy (0 to exit):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            if (choice == 1 || choice == 2) {
                int seatNumber = assignSeat(choice);
                if (seatNumber != -1) {
                    System.out.println("Boarding Pass:");
                    System.out.println("Seat Number: " + seatNumber);
                    System.out.println("Section: " + (choice == 1 ? "First Class" : "Economy"));
                } else {
                    System.out.println("All seats are full. Would you like to be placed in the other section? (Y/N)");
                    char response = scanner.next().charAt(0);
                    if (response == 'Y' || response == 'y') {
                        int newChoice = (choice == 1) ? 2 : 1; // Switch section
                        seatNumber = assignSeat(newChoice);
                        if (seatNumber != -1) {
                            System.out.println("Boarding Pass:");
                            System.out.println("Seat Number: " + seatNumber);
                            System.out.println("Section: " + (newChoice == 1 ? "First Class" : "Economy"));
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else {
                System.out.println("Invalid choice. Please type 1 or 2.");
            }
        }

        scanner.close();
    }

    private static int assignSeat(int section) {
        int startSeat = (section == 1) ? 1 : 6;
        int endSeat = (section == 1) ? 5 : 10;

        for (int seat = startSeat; seat <= endSeat; seat++) {
            if (!seats[seat]) {
                seats[seat] = true; // Mark seat as occupied
                return seat;
            }
        }
        return -1; // No available seat in the chosen section
    }
}
