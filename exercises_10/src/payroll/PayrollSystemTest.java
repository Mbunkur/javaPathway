package payroll;
import java.time.LocalDate;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // get the current month
        int currentMonth = LocalDate.now().getMonthValue();

        // create subclass objects
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(6, 15, 1985));
        hourlyEmployee HourlyEmployee =
                new hourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(7, 22, 1990));
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06, new Date(8, 29, 1988));
        basePlusCommissionEmployee BasePlusCommissionEmployee =
                new basePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(3, 2, 1975));

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings() + (salariedEmployee.getBirthDate().getMonth() == currentMonth ? 100.00 : 0));
        System.out.printf("%s%n%s: $%,.2f%n%n",
                HourlyEmployee, "earned", HourlyEmployee.earnings() + (HourlyEmployee.getBirthDate().getMonth() == currentMonth ? 100.00 : 0));
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings() + (commissionEmployee.getBirthDate().getMonth() == currentMonth ? 100.00 : 0));
        System.out.printf("%s%n%s: $%,.2f%n%n",
                BasePlusCommissionEmployee,
                "earned", BasePlusCommissionEmployee.earnings() + (BasePlusCommissionEmployee.getBirthDate().getMonth() == currentMonth ? 100.00 : 0));

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = HourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = BasePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");
        for (Employee employee : employees) {
            printEarnings(employee, currentMonth);
        }

        // Print the type of each object in the employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
        }

        // Helper method to print earnings for an employee
        private void printEarnings(Employee employee, currentMonth){
            double earnings = employee.earnings();
            if (employee.getBirthDate().getMonth() == currentMonth) {
                earnings += 100.00;
            }
            System.out.printf("%n%s%n%s: $%,.2f%n%n",
                    employee, "earned", earnings);
        }
    }

}