package marks.in;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Subject Marks: ");
		int Sub1 = sc.nextInt();
		int Sub2 = sc.nextInt();
		int Sub3 = sc.nextInt();
		
		if(Sub1>60 && Sub2>60 && Sub3>60) {
			System.out.println("Passed");
		}
		else if((Sub1>60 && Sub2>60) || (Sub2>60 && Sub3>60) || (Sub3>60 && Sub1>60)) {
			System.out.println("Promoted");
		}
		else if(Sub1>60 || Sub2>60 || Sub3>60) {
			System.out.println("Failed...");
		}
		else {
			System.out.println("Failed");
		}
		
	}

}
