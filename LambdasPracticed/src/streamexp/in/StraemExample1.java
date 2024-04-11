package streamexp.in;

import java.util.ArrayList;
import java.util.List;

import unit1execise.in.Person;

public class StraemExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("KK", "Biw", 11));
		list1.add(new Person("MK", "Zib", 16));
		list1.add(new Person("CK", "Nib", 19));
		list1.add(new Person("RK", "Bib", 12));
		list1.add(new Person("PK", "Nick", 12));
		
		// Lambda Expression Enable parallel Processing.
		
//		list1.stream()
//		.filter(p -> p.getLname().startsWith("Z"))
//		.forEach(p -> System.out.println(p.getFname()));
		
		
		
		
		 long count = list1.stream()
					.filter(p -> p.getLname().startsWith("N"))
					.count();
		 System.out.println(count);
 

	}

}
