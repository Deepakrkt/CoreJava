package incomeTax.in;

import java.util.Scanner;

public class IncomTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income: ");
		double income = sc.nextDouble();
		double taxAmount = 0;
		
		if(income<180000) {
			taxAmount = 0;
		}
		else if(income>181001 && income<=300000) {
			taxAmount = income * 0.10;
		}
		else if(income>300001 && income <= 500000) {
			taxAmount = income * 0.20;
		}
		else if(income>300001 && income <= 1000000) {
			taxAmount = income * 0.30;
		}
		else {
			System.out.println("Invalid Income Amount..");
		}
		System.out.println("Income tax Amount: " + taxAmount);
	}

}
