package question3.in;

class SavingAccount extends BankAccount{
	
	protected double fixedDeposite;

	public SavingAccount(String accountType, double balance, double fixedDeposite) {
		super(accountType, balance);
		this.fixedDeposite = fixedDeposite;
	
		
	}
	public double calculateTotalCash() {
        return super.calculateTotalCash() + fixedDeposite;
    }

}
