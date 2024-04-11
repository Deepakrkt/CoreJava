package unit1execise.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

class Check{
	
}

public class Unit1Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("KK", "Biw", 11));
		list1.add(new Person("MK", "Zib", 16));
		list1.add(new Person("CK", "Nib", 19));
		list1.add(new Person("RK", "Bib", 12));
		
		
		
//		ListIterator<Person> list2 = list1.listIterator();
//		while (list2.hasNext()) {
//			Person person =  list2.next();
//			System.out.println(person);
//			
//		}
		
		// Step 1: sort list by last Name
		
//		Collections.sort(list1, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				// TODO Auto-generated method stub
//				
//				return o1.getLname().compareTo(o2.getLname());
//			}
//		});
		
		
//		 JAVA 8 Using Lambda Expression
		
		Collections.sort(list1, (p1,p2) -> p1.getLname().compareTo(p2.getLname()));
		
		// Step 2: create a method that print all element in the list
		
		System.out.println("Printing All Persons");
		printConditionally(list1, p -> true);
		
		// step 3: Create a method that prints all people that have last name beginning with 'B'
		
		System.out.println("-------------------------");
		System.out.println("Printing all person with LastName B");
		printConditionally(list1, p -> p.getLname().startsWith("B"));
		
		System.out.println("-------------------------");
		System.out.println("Printing all person with FirstName M");
		printConditionally(list1, p -> p.getFname().startsWith("M"));
		
	}

	private static void printConditionally(List<Person> list1, Predicate<Person> predicate) {
		// TODO Auto-generated method stub
		for(Person p : list1) {
			if(predicate.test(p))
			System.out.println(p);
		}
		
	}

}
