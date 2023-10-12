package assignment5_q1;

public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new SalariedEmployee("John", "Doe", "123-45-6789", 800.00),
                new HourlyEmployee("Alice", "Smith", "234-56-7890", 15.00, 45.00),
                new CommissionEmployee("Bob", "Johnson", "345-67-8901", 10000.00, 0.10),
                new BaseSalariedCommissionEmployee("Eve", "Williams", "456-78-9012", 5000.00, 0.15, 800.00)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Earnings: $%.2f\n", employee.earnings());
            System.out.println("---------------------------");
        }
    }
}

