package lower.in;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> objList = new ArrayList<>();
		addNumber(objList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(15);
		intList.add(10);
		intList.add(11);
		addNumber(intList);
//		System.out.println(intList);

	}
	private static void addNumber(List<? super Integer> list) {
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
	}

}
