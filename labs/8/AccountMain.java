public class AccountMain {
    public static void main(String[] args) {
    	//Creating Account class object
        Account[] accounts = new Account[3];

        accounts[0] = new Account(10001, 101.0);
        accounts[1] = new CheckingAccount(20002, 202.0, 50.0);
        accounts[2] = new SavingsAccount(30003, 303.0);

        for (Account account: accounts) {
            System.out.println(account);
        }
    }
}