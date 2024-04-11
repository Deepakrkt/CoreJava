package array.in;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Arrays.sort(num);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Search Number: ");
		int number = sc.nextInt();
		
		int index = Arrays.binarySearch(num, number);
		if(index >= 0) {
			System.out.println(number+" is present in the Array.");
		}
		else {
			System.out.println(number+" is not present in the Array.");
		}

	}

}
