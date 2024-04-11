package question3.in;

class CurrentAccount extends BankAccount {
	
	private double cashCredit;

    public CurrentAccount(String accountType, double balance, double cashCredit) {
        super(accountType, balance);
        this.cashCredit = cashCredit;
    }

    @Override
    public double calculateTotalCash() {
        return super.calculateTotalCash() + cashCredit;
    }

}
