import java.util.Random;

public class DiceRollingSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sumCounts = new int[13]; // Array to tally the number of times each possible sum appears

        // Roll the dice 36,000,000 times
        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1; // Roll the first die (generate a random number between 1 and 6)
            int die2 = random.nextInt(6) + 1; // Roll the second die (generate a random number between 1 and 6)
            int sum = die1 + die2; // Calculate the sum of the two values
            sumCounts[sum]++; // Increment the count for the corresponding sum
        }

        // Display the results in tabular format
        System.out.println("Sum\tFrequency");
        System.out.println("-----------------");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + sumCounts[i]);
        }
    }
}
