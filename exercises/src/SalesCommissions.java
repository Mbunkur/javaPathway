public class SalesCommissions {
    public static void main(String[] args) {
        int[] salaries = new int[10]; // Array to store the counts for each salary range

        // Gross sales for each salesperson (in dollars)
        int[] grossSales = {5000, 300, 700, 1000, 450, 600, 800, 1500, 950, 1200};

        // Calculate salaries and update the counters for each range
        for (int sales : grossSales) {
            double commission = 200 + (0.09 * sales); // Calculate commission
            int salaryRange = (int) (commission / 100); // Determine the salary range
            if (salaryRange < 2) {
                salaries[0]++;
            } else if (salaryRange < 10) {
                salaries[salaryRange - 1]++;
            } else {
                salaries[9]++;
            }
        }

        // Display results in tabular format
        System.out.println("Salary Range   | Number of Salespeople");
        System.out.println("---------------------------------");
        for (int i = 0; i < salaries.length; i++) {
            if (i < 8) {
                System.out.printf("$%d00-%d99      | %d%n", i + 2, i + 2, salaries[i]);
            } else {
                System.out.printf("$%d00 and over | %d%n", i + 1, salaries[i]);
            }
        }
    }
}
