public class EightQueens {
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static boolean[] row = new boolean[SIZE];
    private static boolean[] column = new boolean[SIZE];
    private static boolean[] diagonal1 = new boolean[2 * SIZE - 1]; // main diagonal
    private static boolean[] diagonal2 = new boolean[2 * SIZE - 1]; // secondary diagonal

    public static void main(String[] args) {
        initializeBoard();
        solveQueens(0);
        printBoard();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }

    private static void solveQueens(int col) {
        if (col == SIZE) {
            printBoard();
            System.exit(0); // exit after finding one solution
        } else {
            for (int i = 0; i < SIZE; i++) {
                if (isSafe(i, col)) {
                    placeQueen(i, col);
                    solveQueens(col + 1);
                    removeQueen(i, col);
                }
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        return !EightQueens.row[row] && !column[col] && !diagonal1[row + col] && !diagonal2[row - col + SIZE - 1];
    }

    private static void placeQueen(int row, int col) {
        board[row][col] = 1;
        EightQueens.row[row] = true;
        column[col] = true;
        diagonal1[row + col] = true;
        diagonal2[row - col + SIZE - 1] = true;
    }

    private static void removeQueen(int row, int col) {
        board[row][col] = 0;
        EightQueens.row[row] = false;
        column[col] = false;
        diagonal1[row + col] = false;
        diagonal2[row - col + SIZE - 1] = false;
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
