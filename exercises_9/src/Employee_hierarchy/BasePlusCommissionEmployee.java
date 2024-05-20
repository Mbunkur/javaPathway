package Employee_hierarchy;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,
                                      String lastName,
                                      String socialSecurityNumber,
                                      double grossSales,
                                      double commissionRate,
                                      double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Salary can not be negative");
        }
        this.baseSalary = baseSalary;
    }

    //set and get method for base Salary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Salary can not be negative");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    //to String method
    @Override
    public String toString(){
        return String.format("%s %s%n %s: %.2f",
                "base-salaried",super.toString(),
                "base salary", getBaseSalary()
        );
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
}
