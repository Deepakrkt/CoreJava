package mapandset.in;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> student = new HashMap<>();
		
		student.put("Jhon", 15);
		student.put("Tom", 145);
		student.put("Bob", 105);
		student.put("Jim", 46);
		
		System.out.println(student.remove("Bob"));
		
		for(String key : student.keySet()) {
			System.out.println(key+" : "+ student.get(key));
			
		}

	}

}
