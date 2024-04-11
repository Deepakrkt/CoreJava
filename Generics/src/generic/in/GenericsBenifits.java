package generic.in;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsBenifits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Jhon");
		list.add("Tom");
		list.add("Sam");
//	    list.add(100);
		
		Iterator<String> str = list.iterator();
		while(str.hasNext()) {
			String data = str.next();
			System.out.println(data);
		}
		

	}

}
