package polymorphism.in;

class StudentNumber {
	public int add(int n1,int n2) {
		return n1+n2;
	}
}
class GraceNumber extends StudentNumber{
	// Method Overriding or Runtime
	public int add(int n1,int n2) {
		return n1+n2+5;
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraceNumber obj1 = new GraceNumber();
		int r1 = obj1.add(5,5);
		
		System.out.println(r1);

	}

}
