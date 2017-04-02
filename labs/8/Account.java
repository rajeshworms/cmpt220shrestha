import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    //No arg constructor
    public Account() {
    }
    
    //Constructor with parameter
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //Returns id
    public int getId() {
        return id;
    }

    //sets id
    public void setId(int id) {
        this.id = id;
    }

    //Returns balance
    public double getBalance() {
        return balance;
    }

    //sets balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Returns annual interest rate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //sets annual interest rate
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    //Returns date of creation
    public Date getDateCreated() {
        return dateCreated;
    }

    //Returns monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    //Returns monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100.0);
    }

    //Returns value based upon the amount
    public int withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return 1;
        } else {
            return -1;
        }
    }

    //sets the balance if there is deposit
    public void deposit(double amount) {
        balance += amount;
    }

    //returns string description
    @Override
    public String toString() {
        return "Account" + "\nid = " + id + "\nbalance = " + balance + "\nDateCreated = " + dateCreated;
    }
}