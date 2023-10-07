package assignment2_q3;

public class DateTest {
    public static void main(String[] args) {
        // Creating Date objects and demonstrating their capabilities
        Date date1 = new Date(10, 9, 2023); // Assuming month, day, and year are correct
        Date date2 = new Date(12, 25, 2023); // Another date

        // Displaying the dates using displayDate method
        System.out.println("Date 1: ");
        date1.displayDate();

        System.out.println("\nDate 2: ");
        date2.displayDate();

        // Updating the dates using setter methods
        date1.setMonth(12);
        date1.setDay(25);
        date1.setYear(2023);
			
        date2.setMonth(1);
        date2.setDay(1);
        date2.setYear(2024);

        // Displaying the updated dates
        System.out.println("\nUpdated Date 1: ");
        date1.displayDate();

        System.out.println("\nUpdated Date 2: ");
        date2.displayDate();
    }
}