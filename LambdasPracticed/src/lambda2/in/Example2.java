package lambda2.in;

interface Employee{
	int getLength(String s);
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = (String s) -> s.length();
		System.out.println(emp1.getLength("Hey Deepak!")); 

	}

}
