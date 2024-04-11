package question3.in;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank1 = new SavingAccount("Saving",500,600);
		BankAccount bank2 = new CurrentAccount("Current",200,400);
		
		double totalCash = bank1.calculateTotalCash() + bank2.calculateTotalCash();
		System.out.println("Total Cash: "+ totalCash);

	}

}
