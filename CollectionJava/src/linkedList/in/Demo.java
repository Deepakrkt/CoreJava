package linkedList.in;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.addFirst(15);
		list.addLast(100);
		list.add(1,200);
		
		System.out.println(list);

	}

}
