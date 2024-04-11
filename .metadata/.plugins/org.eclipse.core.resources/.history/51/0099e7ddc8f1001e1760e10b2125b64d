package iteratorpracticed.in;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPracticed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp1 = new ArrayList<>();
		emp1.add(new Employee(1, "Jhon", 10000.0, "jhon@gmail.com"));
		emp1.add(new Employee(2, "Bob", 20000.0, "bob@gmail.com"));
		emp1.add(new Employee(3, "Tom", 30000.0, "tom@gmail.com"));
		emp1.add(new Employee(4, "Sam", 40000.0, "sam@gmail.com"));
		
		List<Student> stud1 = new ArrayList<>();
		stud1.add(new Student(1, "Deepak", 101));
		stud1.add(new Student(2, "Deepak", 102));
		stud1.add(new Student(3, "Deepak", 103));
		stud1.add(new Student(4, "Deepak", 104));
		
		Iterator<Student> iterator11 = stud1.iterator();
		while (iterator11.hasNext()) {
			Student student =  iterator11.next();
			if(student.getStudId()==102)
				iterator11.remove();
			System.out.println(student);
		}
		System.out.println("-----------------");
		Iterator<Student> stdIterator = stud1.iterator();
		while (stdIterator.hasNext()) {
			Student student = stdIterator.next();
			
			System.out.println(student);
			
		}
		
		
		System.out.println("--------------------");

		
		Iterator<Employee> iterator = emp1.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getSalary()==30000.0)
				iterator.remove();	
			System.out.println(employee);

		}
		System.out.println("-------------------------");

		Iterator<Employee> iterator2 = emp1.iterator();
		while (iterator2.hasNext()) {
			Employee employee = iterator2.next();
		System.out.println(employee);
		}
		System.out.println(emp1.size());

	}

}
