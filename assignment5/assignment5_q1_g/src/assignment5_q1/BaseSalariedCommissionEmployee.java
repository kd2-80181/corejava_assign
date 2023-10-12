package assignment5_q1;

public class BaseSalariedCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BaseSalariedCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return "Base-Salaried Commission Employee: " + super.toString();
    }
}
