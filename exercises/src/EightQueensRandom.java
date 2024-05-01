import java.util.Random;

public class EightQueensRandom {
    private static final int SIZE = 8;
    private static int[] queens = new int[SIZE];

    public static void main(String[] args) {
        placeQueensRandomly();
        printBoard();
    }

    private static void placeQueensRandomly() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            queens[i] = random.nextInt(SIZE);
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print((queens[i] == j ? "Q " : ". "));
            }
            System.out.println();
        }
    }
}
