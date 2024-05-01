import java.util.Random;

public class KnightsTourRandomWalk {
    private static final int SIZE = 8;
    private static final int[][] moves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };
    private static int[][] board = new int[SIZE][SIZE];
    private static int currentRow;
    private static int currentColumn;
    private static int moveNumber;

    public static void main(String[] args) {
        initializeBoard();
        currentRow = 0;
        currentColumn = 0;
        moveNumber = 1;

        Random random = new Random();
        while (moveNumber <= SIZE * SIZE) {
            int nextMove = random.nextInt(8);
            if (isValidMove(currentRow + moves[nextMove][0], currentColumn + moves[nextMove][1])) {
                moveKnight(nextMove);
                moveNumber++;
            }
        }

        printBoard();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }

    private static boolean isValidMove(int row, int column) {
        return row >= 0 && row < SIZE && column >= 0 && column < SIZE && board[row][column] == 0;
    }

    private static void moveKnight(int moveIndex) {
        currentRow += moves[moveIndex][0];
        currentColumn += moves[moveIndex][1];
        board[currentRow][currentColumn] = moveNumber;
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
