package assignment4;
public class AccountTest {
    public static void main(String[] args){
        Account acc1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5/100);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.printf("Balance: %.2f\nMonthly Interest: %.2f\nDate Created: %s",
         acc1.getBalance(), acc1.getMonthlyInterest(), acc1.getDateCreated().toString());
    }
}