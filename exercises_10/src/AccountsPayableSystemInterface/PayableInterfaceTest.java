package AccountsPayableSystemInterface;
// PayableInterfaceTest.java
public class PayableInterfaceTest {
   public static void main(String[] args) {
      // Create Payable objects
      Payable[] payableObjects = new Payable[] {
              new Invoice("01234", "seat", 2, 375.00),
              new Invoice("56789", "tire", 4, 79.95),
              new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
              new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06),
              new basePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300)
      };

      System.out.println("Processing payable objects:");
      for (Payable payable : payableObjects) {
         System.out.println(payable); // Output String representation

         // Output payment amount for each Payable object
         System.out.printf("Payment amount: $%.2f%n", payable.getPaymentAmount());
      }
   }
}
