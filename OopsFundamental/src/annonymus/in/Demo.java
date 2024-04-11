package annonymus.in;

class A{
	public void show() {
		System.out.println("In A Show");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A() {
			public void show() {
				System.out.println("In new Show");
			}
		};
		obj1.show();
		

	}

}
