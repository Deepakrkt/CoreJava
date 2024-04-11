package upperbouded.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class UpperBoundedWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = Arrays.asList(5,5,5);
		System.out.println("Total= : "+ sum(list1));
		List<Double> list2 = Arrays.asList(4.0,5.0,9.0);
		System.out.println("Total= : "+ sum(list2));
		
	}
		//Method with UpperBounded WildCard
		private static double sum(List<? extends Number> list ) {
			double total = 0.0;
			for(Number num : list) 
				total += num.doubleValue();
			  return total;	
		
		

	}


}
