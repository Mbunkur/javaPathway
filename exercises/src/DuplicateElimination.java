import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        final int SIZE = 5; // Size of the array
        int[] numbers = new int[SIZE]; // Array to store unique numbers
        int uniqueCount = 0; // Number of unique numbers entered

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers between 10 and 100 (inclusive):");

        // Loop to input and check for duplicate numbers
        for (int i = 0; i < SIZE; i++) {
            int input = scanner.nextInt();

            // Check if input is within range
            if (input < 10 || input > 100) {
                System.out.println("Number must be between 10 and 100. Try again.");
                i--; // Decrement i to repeat input for the same position
                continue;
            }

            // Check for duplicates
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[j] == input) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to the array and increment uniqueCount
            if (!isDuplicate) {
                numbers[uniqueCount] = input;
                uniqueCount++;
            }

            // Display unique values after each new input
            System.out.print("Unique values entered so far: ");
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }
}
