package PayrollModified;

// BasePlusCommissionEmployee class
public class basePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public basePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Base Plus Commission Employee: %s%nBase Salary: $%.2f", super.toString(), baseSalary);
    }
}
