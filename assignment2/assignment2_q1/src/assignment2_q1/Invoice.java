package assignment2_q1;


//Invoice class
public class Invoice {
 private String partNumber;
 private String partDescription;
 private int quantity;
 private double pricePerItem;

 // Constructor
 public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
     this.partNumber = partNumber;
     this.partDescription = partDescription;
     setQuantity(quantity);
     setPricePerItem(pricePerItem);
 }

 // Setters
 public void setPartNumber(String partNumber) {
     this.partNumber = partNumber;
 }

 public void setPartDescription(String partDescription) {
     this.partDescription = partDescription;
 }

 public void setQuantity(int quantity) {
     if (quantity > 0) {
         this.quantity = quantity;
     } else {
         this.quantity = 0;
     }
 }

 public void setPricePerItem(double pricePerItem) {
     if (pricePerItem > 0.0) {
         this.pricePerItem = pricePerItem;
     } else {
         this.pricePerItem = 0.0;
     }
 }

 // Getters
 public String getPartNumber() {
     return partNumber;
 }

 public String getPartDescription() {
     return partDescription;
 }

 public int getQuantity() {
     return quantity;
 }

 public double getPricePerItem() {
     return pricePerItem;
 }

 // Method to calculate invoice amount
 public double getInvoiceAmount() {
     return quantity * pricePerItem;
 }
}






