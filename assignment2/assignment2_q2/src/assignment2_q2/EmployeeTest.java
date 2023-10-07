package assignment2_q2;

//EmployeeTest class
public class EmployeeTest {
 public static void main(String[] args) {
     // Creating Employee objects and demonstrating their capabilities
     Employee employee1 = new Employee("John", "Doe", 5000);
     Employee employee2 = new Employee("Jane", "Smith", -3000); // Testing with negative salary

     // Displaying yearly salary before raise
     System.out.println("Employee 1:");
     System.out.println("Name: " + employee1.getFirstName() + " " + employee1.getLastName());
     System.out.println("Monthly Salary: $" + employee1.getMonthlySalary());
     System.out.println("Yearly Salary: $" + employee1.getYearlySalary());

     System.out.println("\nEmployee 2:");
     System.out.println("Name: " + employee2.getFirstName() + " " + employee2.getLastName());
     System.out.println("Monthly Salary: $" + employee2.getMonthlySalary());
     System.out.println("Yearly Salary: $" + employee2.getYearlySalary());

     // Applying a 10% raise to both employees
     employee1.applyRaise(10);
     employee2.applyRaise(10);

     // Displaying yearly salary after raise
     System.out.println("\nEmployee 1 (after 10% raise):");
     System.out.println("Yearly Salary: $" + employee1.getYearlySalary());

     System.out.println("\nEmployee 2 (after 10% raise):");
     System.out.println("Yearly Salary: $" + employee2.getYearlySalary());
 }
}
