package lambda1.in;

interface College{
	void enroll();
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College clg1 = () -> System.out.println("Hey We are using Lambda Expression");
		clg1.enroll();
		
	}
	
}
			
	
