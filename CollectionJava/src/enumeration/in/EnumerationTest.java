package enumeration.in;

import java.util.Enumeration;
//import java.util.List;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		Enumeration<Integer> ele = vector.elements();
		while (ele.hasMoreElements()) {
			Integer n = ele.nextElement();
			System.out.println(n);
//			vector.add(100);
			
		}
		System.out.println(vector);
		
		

	}

}
