package supercon.in;

class A{
	public A() {
		super();
		System.out.println("Default Constructor A");
	}
	public A(int n) {
		super();
		System.out.println("Parametrized Constructor A");
	}
	
}
class B extends A{
	public B() {
		super();
		System.out.println("Default Constructor B");

	}
	public B(int n) {
		this();
//		super(n);
		System.out.println("Parametrized Constructor B");
	}
	
}

public class SuperCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);

	}

}
