import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20]; // Initialize the floor array

        Scanner scanner = new Scanner(System.in);

        int direction = 0; // 0: right, 1: down, 2: left, 3: up
        int x = 0, y = 0; // Current position of the turtle
        boolean penDown = false; // Pen position

        System.out.println("Enter turtle commands (1 to lift pen, 2 to lower pen, 3 to turn right, 4 to turn left, 5,<steps> to move forward, 6 to display floor, 9 to end):");

        int command;
        while ((command = scanner.nextInt()) != 9) {
            switch (command) {
                case 1: // Pen up
                    penDown = false;
                    break;
                case 2: // Pen down
                    penDown = true;
                    break;
                case 3: // Turn right
                    direction = (direction + 1) % 4;
                    break;
                case 4: // Turn left
                    direction = (direction + 3) % 4;
                    break;
                case 5: // Move forward
                    int steps = scanner.nextInt();
                    switch (direction) {
                        case 0: // Right
                            for (int i = 0; i < steps; i++) {
                                if (penDown && x < 19) {
                                    floor[y][x++] = 1;
                                } else if (x < 19) {
                                    x++;
                                }
                            }
                            break;
                        case 1: // Down
                            for (int i = 0; i < steps; i++) {
                                if (penDown && y < 19) {
                                    floor[y++][x] = 1;
                                } else if (y < 19) {
                                    y++;
                                }
                            }
                            break;
                        case 2: // Left
                            for (int i = 0; i < steps; i++) {
                                if (penDown && x > 0) {
                                    floor[y][x--] = 1;
                                } else if (x > 0) {
                                    x--;
                                }
                            }
                            break;
                        case 3: // Up
                            for (int i = 0; i < steps; i++) {
                                if (penDown && y > 0) {
                                    floor[y--][x] = 1;
                                } else if (y > 0) {
                                    y--;
                                }
                            }
                            break;
                    }
                    break;
                case 6: // Display floor
                    displayFloor(floor);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }

    // Method to display the floor array
    private static void displayFloor(int[][] floor) {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
