package compensation;
// Employee class
public class Employee {
    private final String firstName;
    private final String lastName;
    private final CompensationModel compensationModel;

    public Employee(String firstName, String lastName, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.compensationModel = compensationModel;
    }

    public double earnings() {
        return compensationModel.earnings();
    }

    @Override
    public String toString() {
        return String.format("Employee: %s %s%nEarnings: %.2f", firstName, lastName, earnings());
    }
}
