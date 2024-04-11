package armstrong.in;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, temp, r,res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		temp = num;
		while(num>0) {
			r = num%10;
			res = res + (r*r*r);
			num = num/10;
		}
		if(temp==res) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
