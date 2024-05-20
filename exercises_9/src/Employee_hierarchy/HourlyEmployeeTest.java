package Employee_hierarchy;

public class HourlyEmployeeTest {
    public static void main(String[] args){
        HourlyEmployee employee =
                new HourlyEmployee(
                        "tito",
                        "aladji",
                        "9763-142-1125",
                        40,
                        15
                );

        // get base-salaried commission employee data
        System.out.println(
                "Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours worked is",
                employee.getHours());
        System.out.printf("%s %.2f%n", "wage per hour is",
                employee.getWage());

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                employee
                );
    }
}
