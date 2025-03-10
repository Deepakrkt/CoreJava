package listiterator.in;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class ListtIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Employee> emp1 = new ArrayList<>();
	emp1.add(new Employee(1, "Jhon", 100.0, "jhon@gmail.com"));
	emp1.add(new Employee(2, "Bob", 200.0, "Bob@gmail.com"));
	emp1.add(new Employee(3, "Tom", 300.0, "Tom@gmail.com"));
	emp1.add(new Employee(4, "Sam", 400.0, "Sam@gmail.com"));
	
	// Invoke or call method
//	iterateListUsingListIterator(emp1);
//	addElementsInListUsingListIterator(emp1);
//	deleteElementsInListUsingListIterator(emp1);
	replaceElementsInListUsingListIterator(emp1);
	
	}
	
	private static void iterateListUsingListIterator(List<Employee> emp1) {
		
		ListIterator<Employee> list1 = emp1.listIterator();
		System.out.println("Forward Direction..........");
		while (list1.hasNext()) {
			Employee employee = list1.next();
			System.out.println(employee);
	
	}
		System.out.println("Backward Direction..........");
		while (list1.hasPrevious()) {
			Employee employee = list1.previous();
			System.out.println(employee);
	
	}
	}
	private static void addElementsInListUsingListIterator(List<Employee> emp1) {
		ListIterator<Employee> list2 = emp1.listIterator();
		while (list2.hasNext()) {
			Employee employee = list2.next();
			if(!employee.getName().equalsIgnoreCase("Jim")) {
				list2.add(new Employee(6, "Jim", 900.0, "jim@gmail.com"));
				break;
			}
			
			}
		for(Employee employee2 : emp1) {
			System.out.println(employee2);
			
		}
		
	}
	private static void deleteElementsInListUsingListIterator(List<Employee> emp1) {
		
		ListIterator<Employee> list3 = emp1.listIterator();
		while (list3.hasNext()) {
			Employee employee = list3.next();
			if(employee.getName().equalsIgnoreCase("Tom")) {
				list3.remove();
			}
			}
		for(Employee employee2 : emp1) {
			System.out.println(employee2);
			
		}
		
	}
	private static void replaceElementsInListUsingListIterator(List<Employee> emp1) {
		
		System.out.println("..............");
		ListIterator<Employee> list3 = emp1.listIterator();
		while (list3.hasNext()) {
			Employee employee = list3.next();
			if(employee.getName().equalsIgnoreCase("Tom")) {
				employee.setName("Tom Beo");
				list3.set(employee);
			}
			}
		for(Employee employee2 : emp1) {
			System.out.println(employee2);
			
		}
	}



}
