package student.in;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks Student 1: ");
		int SA1 = sc.nextInt();
		int SB1 = sc.nextInt();
		int SC1 = sc.nextInt();
		System.out.println("Enter marks Student 2: ");
		int SA2 = sc.nextInt();
		int SB2 = sc.nextInt();
		int SC2 = sc.nextInt();
		System.out.println("Enter marks Student 3: ");
		int SA3 = sc.nextInt();
		int SB3 = sc.nextInt();
		int SC3 = sc.nextInt();
		
		//Each student marks
		int s1 = SA1+SB1+SC1;
		double avgS1 = s1/3;
		int s2 = SA2+SB2+SC2;
		double avgS2 = s2/3;
		int s3 = SA3+SB3+SC3;
		double avgS3 = s3/3;
		
		// subject wise average
		int subA = SA1+SA2+SA3;
		double subAavg = subA/3;
		
		int subB = SB1+SB2+SB3;
		double subBavg = subB/3;
		
		int subC = SC1+SC2+SC3;
		double subCavg = subC/3;
		
		//Student wise Score and Average
		System.out.println("Student 1 Total Marks: " + s1 + ", Average Marks: " + avgS1);
		System.out.println("Student 2 Total Marks: " + s2 + ", Average Marks: " + avgS2);
		System.out.println("Student 3 Total Marks: " + s3 + ", Average Marks: " + avgS3);
		
		//Subject wise Score and Average
		System.out.println("Subject A Total Marks: " + subA + ", Average Marks: " + subAavg);
		System.out.println("Subject B Total Marks: " + subB + ", Average Marks: " + subBavg);
		System.out.println("Subject C Total Marks: " + subC + ", Average Marks: " + subCavg);
	

	}

}
