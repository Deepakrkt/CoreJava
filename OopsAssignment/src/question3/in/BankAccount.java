package question3.in;

public class BankAccount {
	protected String accountType;
    protected double balance;

    public BankAccount(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public double calculateTotalCash() {
        return balance;
    }

}
