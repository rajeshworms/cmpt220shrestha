public class CheckingAccount extends Account{
    private double overdraftLimit = 100.00;

    //No arg constructor
    public CheckingAccount() {
    }

    //Constructor with arguments
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //returns over draft limits
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    //sets over draft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    //Overrides the super class method
    @Override
    public int withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit) {
            setBalance(getBalance() - amount);
            return 1;
        } else {
            return -1;
        }
    }

    //returns string description
    @Override
    public String toString() {
        return "CheckingAccount\n" + "id = " + getId() + "\nbalance = " + getBalance() +
                "\noverdraftLimit = " + overdraftLimit + "\ndateCreated = " + getDateCreated();
    }
}