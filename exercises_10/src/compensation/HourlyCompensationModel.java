package compensation;
// HourlyCompensationModel class
public class HourlyCompensationModel implements CompensationModel {
    private double wage;
    private double hours;

    public HourlyCompensationModel(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        double overtime = Math.max(0, hours - 40);
        return (hours - overtime) * wage + overtime * wage * 1.5;
    }
}
