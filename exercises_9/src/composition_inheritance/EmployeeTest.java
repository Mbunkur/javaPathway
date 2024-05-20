package composition_inheritance;

public class EmployeeTest {
           public static void main(String[] args) {
            // Create a CommissionCompensationModel
            CompensationModel commissionModel = new commissionCompensationModel(10000, 0.06);

            // Create a BasePlusCommissionCompensationModel
            CompensationModel basePlusCommissionModel = new BasePlusCommissionCompensationModel(5000, 0.04, 300);

            // Create Employee objects with the initial compensation models
            Employee employee1 = new Employee("John", "Doe", "111-11-1111", commissionModel);
            Employee employee2 = new Employee("Jane", "Smith", "222-22-2222", basePlusCommissionModel);

            // Display each Employee's earnings
            System.out.println("Initial Earnings:");
            System.out.println(employee1);
            System.out.println(employee2);

            // Change each Employee's CompensationModel dynamically
            employee1.setCompensationModel(new BasePlusCommissionCompensationModel(12000, 0.05, 500));
            employee2.setCompensationModel(new commissionCompensationModel(7000, 0.07));

            // Redisplay each Employee's earnings
            System.out.println("\nEarnings after changing CompensationModel:");
            System.out.println(employee1);
            System.out.println(employee2);
        }


}
