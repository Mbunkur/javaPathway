import java.util.Scanner;

public class MonthlySalesSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] sales = new double[5][6]; // 5 products, 4 salespeople, plus totals

        // Input sales data for last month
        for (int salesperson = 1; salesperson <= 4; salesperson++) {
            for (int product = 1; product <= 5; product++) {
                System.out.print("Enter total dollar value of product " + product + " sold by salesperson " + salesperson + " last month: ");
                double salesValue = scanner.nextDouble();
                sales[product - 1][salesperson] = salesValue;
            }
        }

        // Calculate row totals (total sales of each product)
        for (int i = 0; i < 5; i++) {
            double rowTotal = 0;
            for (int j = 1; j <= 4; j++) {
                rowTotal += sales[i][j];
            }
            sales[i][5] = rowTotal; // Store row total in the last column
        }

        // Calculate column totals (total sales by each salesperson)
        for (int j = 1; j <= 4; j++) {
            double colTotal = 0;
            for (int i = 0; i < 5; i++) {
                colTotal += sales[i][j];
            }
            sales[5][j] = colTotal; // Store column total in the last row
        }

        // Display sales summary in tabular format
        System.out.println("Sales Summary for Last Month:");
        System.out.println("Product | Salesperson 1 | Salesperson 2 | Salesperson 3 | Salesperson 4 | Total");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-7d", i + 1); // Print product number
            for (int j = 1; j <= 5; j++) {
                System.out.printf("| $%-12.2f", sales[i][j]); // Print sales for each salesperson and total
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------");
        System.out.print("Total   "); // Print row for total sales of each product
        for (int j = 1; j <= 5; j++) {
            System.out.printf("| $%-12.2f", sales[5][j]); // Print total sales by each salesperson
        }
        System.out.println();

        scanner.close();
    }
}
