import java.util.Date;

public class Account {
        private static double annualInterestRate = 0;
        private Date dateCreated = new Date();
        private int id = 0;
        private double balance = 0;
        
        //No arg constructor
        Account() {
        }
        
        //Constructor to set id and balance
        Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }
        
        //returns interest rate
        static double getAnnualInterestRate() {
            return annualInterestRate;
        }
        
        //Sets annual interest rate
        static void setAnnualInterestRate(double annualInterestRate) {
            Account.annualInterestRate = annualInterestRate;
        }
        
        //sets id
        void setId(int id) {
            this.id = id;
        }

        //returns id
        int getId() {
            return id;
        }
        
        //returns balance
       double getBalance() {
            return balance;
        }
       
       //sets balance
       void setBalance(double balance) {
           this.balance = balance;
       }

        //returns date of creation
        Date getDateCreated() {
            return dateCreated;
        }
        
        //returns monthly interest
        double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100.0);
        }
        
        //return monthly interest rate
        double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }
        
        //Sets the balance if withdrawn
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            }
        }

        //Sets the balance if there is deposit
        void deposit(double amount) {
            balance += amount;
        }
    }