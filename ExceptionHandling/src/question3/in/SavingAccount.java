package question3.in;

public class SavingAccount{
	private long id;
	private double balance;

	public SavingAccount(long id, double balance) {
	    this.id = id;
	    this.balance = balance;
	}

	public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
	    if (amount < 0) {
	        throw new IllegalBankTransactionException("Withdraw amount cannot be negative.");
	    }

	    if (amount > balance) {
	        throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
	    }

	    if (balance == 0 && amount > 0) {
	        throw new InsufficientBalanceException("Cannot withdraw from zero balance.");
	    }

	    balance -= amount;
	    return balance;

	}
	
}



