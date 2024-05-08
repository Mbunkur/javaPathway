
public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        SavingAccount.modifyInterestRate(0.04); // Set annualInterestRate to 4%

        System.out.println("Monthly balances with 4% interest rate:");
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d - Saver1: %.2f, Saver2: %.2f%n", i + 1, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        SavingAccount.modifyInterestRate(0.05); // Set annualInterestRate to 5%

        System.out.println("\nMonthly balances with 5% interest rate:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Month 13 - Saver1: %.2f, Saver2: %.2f%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}
