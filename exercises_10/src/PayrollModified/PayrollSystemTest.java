package PayrollModified;
// PayrollSystemTest class
// PayrollSystemTest class
public class PayrollSystemTest {
    public static void main(String[] args) {
        // Create an array of Employee variables
        Employee[] employees = new Employee[7];

        // Initialize array with objects of each concrete class in the hierarchy
        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        employees[1] = new hourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        employees[2] = new PieceWorker("Bob", "Lewis", "333-33-3333", 2.50, 1000);
        employees[3] = new CommissionEmployee("Sue", "Jones", "444-44-4444", 10000, 0.06);
        employees[4] = new basePlusCommissionEmployee("Mike", "Davis", "555-55-5555", 5000, 0.04, 300);
        employees[5] = new hourlyEmployee("Alice", "Johnson", "666-66-6666", 15.50, 50);
        employees[6] = new SalariedEmployee("Emma", "Wilson", "777-77-7777", 1200.00); // New SalariedEmployee object

        // Process each Employee in the array
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Earnings: $%.2f%n%n", employee.earnings());
        }
    }
}
