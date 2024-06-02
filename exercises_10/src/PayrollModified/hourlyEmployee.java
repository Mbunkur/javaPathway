package PayrollModified;
// HourlyEmployee class
public class hourlyEmployee extends Employee {
    private double wagePerHour;
    private double hoursWorked;

    public hourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wagePerHour, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wagePerHour = wagePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return wagePerHour * hoursWorked;
        } else {
            return 40 * wagePerHour + (hoursWorked - 40) * wagePerHour * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nWage per Hour: $%.2f%nHours Worked: %.2f", super.toString(), wagePerHour, hoursWorked);
    }
}
