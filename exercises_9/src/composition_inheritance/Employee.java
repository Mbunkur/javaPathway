package composition_inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;//object of compensationModel class

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    // Set method for changing the CompensationModel
    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    // Earnings method that calls the CompensationModel's earnings method
    public double earnings() {
        return compensationModel.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nEarnings: %.2f",
                firstName, lastName, socialSecurityNumber, earnings());
    }
}
