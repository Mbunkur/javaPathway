public class KnightsClosedTour {
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int startRow;
    private static int startCol;

    public static void main(String[] args) {
        initializeBoard();
        startRow = 0; // Starting row for the knight
        startCol = 0; // Starting column for the knight
        solveKnightsTour(startRow, startCol, 1); // Start solving the tour from the starting square
        printBoard();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }

    private static void solveKnightsTour(int row, int col, int move) {
        board[row][col] = move; // Mark the current square as visited
        if (move == SIZE * SIZE) {
            if (isClosedTour(row, col)) {
                System.out.println("Closed Tour found!");
                return;
            }
        }
        for (int i = 0; i < 8; i++) {
            int nextRow = row + vertical[i];
            int nextCol = col + horizontal[i];
            if (isValidMove(nextRow, nextCol)) {
                solveKnightsTour(nextRow, nextCol, move + 1);
            }
        }
        board[row][col] = 0; // Backtrack: Mark the current square as unvisited
    }

    private static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == 0);
    }

    private static boolean isClosedTour(int row, int col) {
        for (int i = 0; i < 8; i++) {
            int nextRow = row + vertical[i];
            int nextCol = col + horizontal[i];
            if (nextRow == startRow && nextCol == startCol) {
                return true;
            }
        }
        return false;
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
