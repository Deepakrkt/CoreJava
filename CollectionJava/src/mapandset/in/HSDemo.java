package mapandset.in;

import java.util.HashSet;
import java.util.Set;

public class HSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num = new HashSet<>();
		num.add(5);
		num.add(4);
		num.add(3);
		num.add(11);
		num.add(6);
		num.add(9);
		
		for(Object n : num) {
			int res = (Integer)n;
			System.out.println(res*2);
		}
		
//		System.out.println(num);

	}

}
