package Employee_hierarchy;

public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;

    //constructor
    public HourlyEmployee(String firstName,
                          String lastName,
                          String socialSecurityNumber,
                          double hours,
                          double wage){
        super(firstName, lastName, socialSecurityNumber);

        if(hours < 0.0 || hours > 168){
            throw new IllegalArgumentException("hours should be between 0 and 168");
        }
        this.hours = hours;

        if(wage < 0.0){
            throw new IllegalArgumentException("wage should not be negative");
        }
        this.wage = wage;
    }

    //set and get methods for instance variables
    public void setHours(double hours){
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("hours should be between 0 and 168");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("wage should be positive");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double earnings(){
        return wage * hours;
    }

    public String toString(){
        return String.format("%s %s %n%s %.3f%n",
                "hourly ", super.toString(),
                "total wage ", earnings());
    }
}
