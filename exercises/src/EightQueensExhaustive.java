public class EightQueensExhaustive {
    private static final int SIZE = 8;
    private static int[] queens = new int[SIZE];

    public static void main(String[] args) {
        solveQueens(0);
        printBoard();
    }

    private static void solveQueens(int col) {
        if (col == SIZE) {
            printBoard();
            System.exit(0); // exit after finding one solution
        } else {
            for (int i = 0; i < SIZE; i++) {
                queens[col] = i;
                if (isValid(col)) {
                    solveQueens(col + 1);
                }
            }
        }
    }

    private static boolean isValid(int col) {
        for (int i = 0; i < col; i++) {
            if (queens[i] == queens[col] || Math.abs(queens[i] - queens[col]) == col - i) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print((queens[i] == j ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }
}
