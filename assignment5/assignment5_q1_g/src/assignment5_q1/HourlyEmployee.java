package assignment5_q1;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
            return 40 * hourlyWage + (hoursWorked - 40) * (hourlyWage * 1.5);
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString();
    }
}
