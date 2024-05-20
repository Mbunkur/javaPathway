package composition_inheritance;

public class commissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;

    public commissionCompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}
