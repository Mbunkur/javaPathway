package Employee_hierarchy;

//Employee class inherits from class Object
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        //implicit call to class Object's constructor//no argument constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "employee", firstName, lastName,
                "social security number ", socialSecurityNumber);
    }
}
