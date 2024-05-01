import java.util.Scanner;
import java.util.Arrays;

public class TwoByThreeArray {
    public static void main(String[] args) {
        // Declare and create the array t
        int[][] t = new int[2][3];

        // Number of rows
        int rows = t.length;

        // Number of columns
        int columns = t[0].length;

        // Number of elements
        int elements = rows * columns;

        // Access expressions for elements in row 1
        for (int i = 0; i < columns; i++) {
            System.out.println("Element in row 1, column " + i + ": " + t[1][i]);
        }

        // Access expressions for elements in column 2
        for (int i = 0; i < rows; i++) {
            System.out.println("Element in row " + i + ", column 2: " + t[i][2]);
        }

        // Set the element in row 0 and column 1 to zero
        t[0][1] = 0;

        // Initialize each element to zero individually
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[i][j] = 0;
            }
        }

        // Input values for elements from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for t[" + i + "][" + j + "]: ");
                t[i][j] = scanner.nextInt();
            }
        }

        // Print the array t
        System.out.println("Array t:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }


        // Find the smallest value in t
        int smallest = t[0][0];
        for (int[] row : t) {
            for (int value : row) {
                if (value < smallest) {
                    smallest = value;
                }
            }
        }
        System.out.println("Smallest value in t: " + smallest);

        // Print elements of the first row using printf
        System.out.printf("Elements of the first row: %d, %d, %d%n", t[0][0], t[0][1], t[0][2]);

        // Total elements of the third column without iteration
        int totalThirdColumn = t[0][2] + t[1][2];
        System.out.println("Total of the elements in the third column: " + totalThirdColumn);

        // Display contents of t in tabular format
        System.out.println("Contents of t in tabular format:");
        System.out.println("   | 0  1  2");
        System.out.println("------------");
        for (int i = 0; i < t.length; i++) {
            System.out.printf("%d | ", i);
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%-3d", t[i][j]);
            }
            System.out.println();
        }
    }
}
