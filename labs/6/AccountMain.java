
public class AccountMain {
    public static void main(String[] args) {
        //Creating Account class object
        Account account = new Account(1122, 20000);
        account.withdraw(2500);
        account.deposit(3000);
        
        //To set annual interest rate
        Account.setAnnualInterestRate(4.5);
       
        
        //To display the data
        System.out.println("\t -Account " + account.getId() + "- ");
        System.out.println("Balance:\t\t" + account.getBalance());
        System.out.println("Monthly interest:\t" + account.getMonthlyInterest());
        System.out.println("Date Created:\t\t" + account.getDateCreated().toString());
    }

}