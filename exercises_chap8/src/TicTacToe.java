import java.util.Scanner;

public class TicTacToe {
    private enum Cell { X, O, EMPTY }
    private Cell[][] board;
    private Cell currentPlayer;
    private boolean gameOver;

    public TicTacToe() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
        currentPlayer = Cell.X; // X starts the game
        gameOver = false;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe!");

        while (!gameOver) {
            printBoard();

            int row, col;
            do {
                System.out.print("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!isValidMove(row, col));

            board[row][col] = currentPlayer;
            if (isGameWon()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (isGameDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            } else {
                switchPlayer();
            }
        }
        scanner.close();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == Cell.X) ? Cell.O : Cell.X;
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != Cell.EMPTY) {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        return true;
    }

    private boolean isGameWon() {
        // Check rows, columns, and diagonals for a win
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != Cell.EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != Cell.EMPTY && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (board[0][0] != Cell.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != Cell.EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    private boolean isGameDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false; // If there's an empty cell, game is not draw
                }
            }
        }
        return true; // All cells are filled, it's a draw
    }

    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
