package interest.in;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		double P = sc.nextDouble();
		System.out.println("Enter the Rate: ");
		double R = sc.nextDouble();
		System.out.println("Enter the Time: ");
		double T = sc.nextDouble();
		
		double si_interest = (P * R * T)/100;
		double ci_interest = P * Math.pow(1.0+R/100.0,T)-P;
		System.out.println("Simple Interest: "+si_interest);
		System.out.println("Compound Interest: "+ci_interest);

		
		
	}

}
