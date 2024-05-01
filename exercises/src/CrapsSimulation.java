import java.util.Random;

public class CrapsSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        int wins = 0; // Total number of games won
        int losses = 0; // Total number of games lost
        int[] winCount = new int[22]; // To track wins on each roll
        int[] lossCount = new int[22]; // To track losses on each roll
        int totalRolls = 0; // Total number of rolls in all games

        // Simulate 1,000,000 games of craps
        for (int i = 0; i < 1_000_000; i++) {
            int rollCount = playCraps(random);
            totalRolls += rollCount;

            if (rollCount > 20) {
                winCount[21]++; // Count games won after the twentieth roll
            } else {
                winCount[rollCount]++; // Count games won on each roll
            }

            if (rollCount == -1) {
                losses++; // Count games lost on the first roll
                lossCount[1]++; // Count games lost on the first roll
            } else if (rollCount > 20) {
                losses++; // Count games lost after the twentieth roll
                lossCount[21]++; // Count games lost after the twentieth roll
            } else {
                losses += rollCount; // Count games lost on each roll
                lossCount[rollCount]++; // Count games lost on each roll
            }

            if (rollCount >= 0) {
                wins++; // Count games won
            }
        }

        // Calculate the chances of winning at craps
        double winChance = (double) wins / 1_000_000;
        double lossChance = (double) losses / 1_000_000;

        // Calculate the average length of a game of craps
        double averageLength = (double) totalRolls / 1_000_000;

        // Output results
        System.out.println("Wins on each roll:");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Roll " + i + ": " + winCount[i]);
        }
        System.out.println("Wins after twentieth roll: " + winCount[21]);
        System.out.println();

        System.out.println("Losses on each roll:");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Roll " + i + ": " + lossCount[i]);
        }
        System.out.println("Losses after twentieth roll: " + lossCount[21]);
        System.out.println();

        System.out.println("Chances of winning at craps: " + (winChance * 100) + "%");
        System.out.println("Chances of losing at craps: " + (lossChance * 100) + "%");
        System.out.println();

        System.out.println("Average length of a game of craps: " + averageLength);
    }

    // Simulates a single game of craps
    private static int playCraps(Random random) {
        int rollCount = 0;
        int point = 0;

        // First roll
        int roll = rollDice(random);
        rollCount++;

        switch (roll) {
            case 7:
            case 11:
                return rollCount; // Win on first roll
            case 2:
            case 3:
            case 12:
                return 0; // Lose on first roll
            default:
                point = roll; // Set point
        }

        // Subsequent rolls
        while (true) {
            roll = rollDice(random);
            rollCount++;
            if (roll == point) {
                return rollCount; // Win by matching point
            } else if (roll == 7) {
                return 0; // Lose by rolling a 7
            }
        }
    }

    // Simulates rolling two dice and returning their sum
    private static int rollDice(Random random) {
        return random.nextInt(6) + 1 + random.nextInt(6) + 1;
    }
}
