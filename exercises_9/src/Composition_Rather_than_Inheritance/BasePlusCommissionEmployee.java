package Composition_Rather_than_Inheritance;
public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public void setGrossSales(double grossSales) {
        commissionEmployee.setGrossSales(grossSales);
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public void setCommissionRate(double commissionRate) {
        commissionEmployee.setCommissionRate(commissionRate);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f",
                "base-salaried", commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}
