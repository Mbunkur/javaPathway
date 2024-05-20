package Composition_Rather_than_Inheritance;
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // Create CommissionEmployee
        CommissionEmployee commissionEmployee = new CommissionEmployee("John", "Doe", "111-11-1111", 10000, 0.06);

        // Create BasePlusCommissionEmployee using composition
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jane", "Smith", "222-22-2222", 5000, 0.04, 300);

        // Display initial earnings
        System.out.println("Initial Earnings:");
        System.out.println(commissionEmployee);
        System.out.println();
        System.out.println(basePlusCommissionEmployee);

        // Modify earnings and display updated earnings
        commissionEmployee.setGrossSales(12000);
        commissionEmployee.setCommissionRate(0.07);

        basePlusCommissionEmployee.setGrossSales(7000);
        basePlusCommissionEmployee.setBaseSalary(500);

        System.out.println("\n\nUpdated Earnings:");
        System.out.println(commissionEmployee);
        System.out.println("\n");
        System.out.println(basePlusCommissionEmployee);
    }
}
