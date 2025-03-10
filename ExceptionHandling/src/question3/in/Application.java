package question3.in;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount savingAcc = new SavingAccount(1, 1000);

        try {
            double withdraw1 = savingAcc.withdraw(1900);
            System.out.println("Withdrawn Amount 1: " + withdraw1);
        } catch (InsufficientBalanceException | IllegalBankTransactionException e) {
            System.out.println("Error 1: " + e.getMessage());
        }

        try {
            double withdraw2 = savingAcc.withdraw(100);
            System.out.println("Withdrawn Amount 2: " + withdraw2);
        } catch (InsufficientBalanceException | IllegalBankTransactionException e) {
            System.out.println("Error 2: " + e.getMessage());
        }

	}

}
