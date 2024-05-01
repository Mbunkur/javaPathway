import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] salesData = new double[4][5]; // 4 salespeople, 5 products

        // Input sales data
        for (int i = 0; i < 4; i++) {
            int salesperson = i + 1;
            for (int j = 0; j < 5; j++) {
                int product = j + 1;
                System.out.print("Enter total dollar value of product " + product + " sold by salesperson " + salesperson + ": ");
                double salesValue = scanner.nextDouble();
                salesData[i][j] = salesValue;
            }
        }

        // Calculate and display total sales for each salesperson
        System.out.println("\nTotal sales for each salesperson:");
        for (int i = 0; i < 4; i++) {
            double totalSales = 0;
            int salesperson = i + 1;
            for (int j = 0; j < 5; j++) {
                totalSales += salesData[i][j];
            }
            System.out.println("Salesperson " + salesperson + ": $" + totalSales);
        }

        // Calculate and display total sales for each product
        System.out.println("\nTotal sales for each product:");
        for (int j = 0; j < 5; j++) {
            double totalSales = 0;
            int product = j + 1;
            for (int i = 0; i < 4; i++) {
                totalSales += salesData[i][j];
            }
            System.out.println("Product " + product + ": $" + totalSales);
        }

        scanner.close();
    }
}
