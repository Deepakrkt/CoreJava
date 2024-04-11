package exceptionn.in;

import java.util.Scanner;

class DivideNumber{
	
	public void divide() {
        Scanner scanner = new Scanner(System.in);

		try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            divideAndDisplay(num1, num2);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
	}

	public void divideAndDisplay(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new UnsupportedOperationException("Division by zero is not allowed.");
        }
        int result = num1 / num2;
        System.out.println("Result of division: " + result);
    }
}

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideNumber obj1 = new DivideNumber();
		obj1.divide();
	}

}
