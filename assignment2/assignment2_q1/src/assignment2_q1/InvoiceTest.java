package assignment2_q1;

public class InvoiceTest {
    public static void main(String[] args) {
        // Creating Invoice objects and demonstrating their capabilities
        Invoice invoice1 = new Invoice("001", "Hammer", 5, 12.99);
        Invoice invoice2 = new Invoice("002", "Screwdriver", -2, -9.99); // Testing with negative values

        // Displaying invoice details and amounts
        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice1.getInvoiceAmount());

        System.out.println("\nInvoice 2:");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per Item: $" + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice2.getInvoiceAmount());
    }
}
