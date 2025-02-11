package genericclass.in;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Integer> std1 = new Student<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		std1.setList(list1);
		List<Integer> list =  std1.getList();
		list.forEach(System.out::println);
		System.out.println("...................");
		
		Student<String> std2 = new Student<>();
		List<String> list2 = new LinkedList<>();
		list2.add("Jhon");
		list2.add("Sam");
		list2.add("Tom");
		std2.setList(list2);
		List<String> str1 = std2.getList();
		str1.forEach(System.out::println);
		System.out.println("...................");
		
		
		// for second GenericClass
		
		Student2<Integer, String> strStudent2 = new Student2<Integer, String>(100, "Tom");
		System.out.println(strStudent2.getKey()+"\t"+strStudent2.getValue());
		
		
		Student2<String, Integer> strStudent3 = new Student2<>("Bob",1055);
		System.out.println(strStudent3.getKey()+"\t"+strStudent3.getValue());

		
		
		
		
		
		
		
		

	}

}
