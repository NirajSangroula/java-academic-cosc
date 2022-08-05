package assignment4;
import java.util.*;
class Account {
    
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    Account(){
        dateCreated = new Date();
    }

    Account(int id, int balance){
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance() {
            return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public static double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
}