public class KnightsTour {
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

        while (moveNumber <= SIZE * SIZE) {
            int nextMove = getNextMove();
            if (nextMove == -1) {
                break; // No valid moves left
            }

            moveKnight(nextMove);
            moveNumber++;
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

    private static int getNextMove() {
        int minMoves = 9;
        int minIndex = -1;

        for (int i = 0; i < moves.length; i++) {
            int nextRow = currentRow + moves[i][0];
            int nextColumn = currentColumn + moves[i][1];

            if (isValidMove(nextRow, nextColumn)) {
                int movesAvailable = countAvailableMoves(nextRow, nextColumn);
                if (movesAvailable < minMoves) {
                    minMoves = movesAvailable;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }

    private static boolean isValidMove(int row, int column) {
        return row >= 0 && row < SIZE && column >= 0 && column < SIZE && board[row][column] == 0;
    }

    private static int countAvailableMoves(int row, int column) {
        int count = 0;
        for (int[] move : moves) {
            int nextRow = row + move[0];
            int nextColumn = column + move[1];
            if (isValidMove(nextRow, nextColumn)) {
                count++;
            }
        }
        return count;
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
