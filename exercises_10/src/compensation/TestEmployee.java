package compensation;
// Test application
public class TestEmployee {
    public static void main(String[] args) {
        // Create employees with different compensation models
        Employee salariedEmployee = new Employee("John", "Doe", new SalariedCompensationModel(1000));
        Employee hourlyEmployee = new Employee("Jane", "Smith", new HourlyCompensationModel(20, 45));
        Employee commissionEmployee = new Employee("Tom", "Jones", new CommissionCompensationModel(5000, 0.1));
        Employee basePlusCommissionEmployee = new Employee("Alice", "Johnson", new BasePlusCommissionCompensationModel(10000, 0.05, 1000));

        // Display initial earnings
        System.out.println("Initial Earnings:");
        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(commissionEmployee);
        System.out.println(basePlusCommissionEmployee);

        // Change compensation models dynamically
        salariedEmployee = new Employee("John", "Doe", new SalariedCompensationModel(1200));
        hourlyEmployee = new Employee("Jane", "Smith", new HourlyCompensationModel(25, 50));
        commissionEmployee = new Employee("Tom", "Jones", new CommissionCompensationModel(7000, 0.12));
        basePlusCommissionEmployee = new Employee("Alice", "Johnson", new BasePlusCommissionCompensationModel(12000, 0.06, 1500));

        // Display updated earnings
        System.out.println("\nUpdated Earnings:");
        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(commissionEmployee);
        System.out.println(basePlusCommissionEmployee);
    }
}
