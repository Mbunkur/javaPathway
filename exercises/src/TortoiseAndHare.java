import java.util.Random;

public class TortoiseAndHare{
    public static void main(String[] args) {
        int tortoisePosition = 1;
        int harePosition = 1;
        Random rand = new Random();

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY’RE OFF !!!!!");

        while (tortoisePosition < 70 && harePosition < 70) {
            int tortoiseMove = rand.nextInt(10) + 1;
            int hareMove = rand.nextInt(10) + 1;

            // Move the tortoise
            if (tortoiseMove >= 1 && tortoiseMove <= 5) {
                tortoisePosition += 3; // Fast plod
            } else if (tortoiseMove >= 6 && tortoiseMove <= 7) {
                tortoisePosition -= 6; // Slip
            } else {
                tortoisePosition += 1; // Slow plod
            }

            // Move the hare
            if (hareMove >= 1 && hareMove <= 2) {
                harePosition += 9; // Big hop
            } else if (hareMove == 3 || hareMove == 4) {
                harePosition -= 12; // Big slip
            } else if (hareMove >= 5 && hareMove <= 7) {
                harePosition += 1; // Small hop
            } else {
                harePosition -= 2; // Small slip
            }

            // Ensure positions are within bounds
            tortoisePosition = Math.max(tortoisePosition, 1);
            harePosition = Math.max(harePosition, 1);

            // Display the race
            for (int i = 1; i <= 70; i++) {
                if (i == tortoisePosition && i == harePosition) {
                    System.out.print("OUCH!!!");
                } else if (i == tortoisePosition) {
                    System.out.print("T");
                } else if (i == harePosition) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Check for winner
            if (tortoisePosition >= 70 && harePosition >= 70) {
                System.out.println("It's a tie.");
            } else if (tortoisePosition >= 70) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
            } else if (harePosition >= 70) {
                System.out.println("Hare wins. Yuch.");
            }

            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
