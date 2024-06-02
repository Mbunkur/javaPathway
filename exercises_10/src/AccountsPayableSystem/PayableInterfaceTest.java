package AccountsPayableSystem;
public class PayableInterfaceTest {
   public static void main(String[] args) {
      // Create Payable objects
      Payable[] payableObjects = new Payable[] {
              new Invoice("01234", "seat", 2, 375.00),
              new Invoice("56789", "tire", 4, 79.95),
              new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
              new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
              new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06),
              new basePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300)
      };

      System.out.println("Processing payable objects:");
      for (Payable payable : payableObjects) {
         System.out.println(payable); // Output String representation

         // Increase base salary by 10% if object is BasePlusCommissionEmployee
         if (payable instanceof basePlusCommissionEmployee) {
            basePlusCommissionEmployee bpcEmployee = (basePlusCommissionEmployee) payable;
            double increasedBaseSalary = bpcEmployee.getBaseSalary() * 1.10;
            bpcEmployee.setBaseSalary(increasedBaseSalary);
         }

         // Output payment amount for each Payable object
         System.out.printf("Payment amount: $%.2f%n", payable.getPaymentAmount());
      }
   }
}
