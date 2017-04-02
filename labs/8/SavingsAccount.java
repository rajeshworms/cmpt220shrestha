public class SavingsAccount extends Account {

	//No arg constructor
    public SavingsAccount() {
    }

    //Constructor with parameter
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    //returns string description
    @Override
    public String toString() {
        return "SavingsAccount \n" +"id = " + getId() + "\nbalance = " + getBalance() +
                " \ndateCreated = " + getDateCreated();
    }
}