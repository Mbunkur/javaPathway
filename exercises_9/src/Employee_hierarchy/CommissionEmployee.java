package Employee_hierarchy;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber,
                              double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales shouldn't be negative ");
        }
        this.grossSales = grossSales;

        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("commission rate should be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    ///set and get methods
    public void setgrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("gross sales should not be negative ");
        }
        this.grossSales = grossSales;
    }
    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0 ");
        }
        this.commissionRate = commissionRate;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public String toString(){
        return String.format("%s %s%n%s:%.2f%n%s: %.2f",
                "commission Employee",super.toString(),
                "gross Sales", getGrossSales(),
                "commissionRate", getCommissionRate());
    }

    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }
}
