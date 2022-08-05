package cosc1047.assignment2.ex2;

public class Test {
    public static void main(String args[]) {
        Account a = new Account(1111, 2000);
        a.withdraw(10);
        System.out.println(a);
        CheckingAccount ca = new CheckingAccount(1112, 10000, -50);
        ca.withdraw(6000);
        ca.withdraw(4000);
        ca.withdraw(51);
        System.out.println(ca);

        SavingAccount sa = new SavingAccount(1113, 100);
        ca.withdraw(50);
        ca.withdraw(51);
        System.out.println(sa);
    }
}
