package failfastandfailsafe.in;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastandFailSafeIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<String, Integer> student = new HashMap<>();
		
//		ConcurrentHashMap
		Map<String, Integer> student = new ConcurrentHashMap<>();

		student.put("Jhon", 10);
		student.put("Tom", 20);
		student.put("Bob", 30);
		student.put("Rim", 40);
		
		Set<String> keySet = student.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			student.put("Ram", 101);
			String studres1 =  iterator.next();
			System.out.println(studres1+ " : "+student.get(studres1));
			
		}
		

	}

}
