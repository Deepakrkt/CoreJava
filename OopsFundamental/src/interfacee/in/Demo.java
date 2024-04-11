package interfacee.in;

interface A{
	
	int age = 23; // by default in interface every variable final and static.
	String area = "Renukoot";
	void show();
	void config();
}

interface X{
	void run();
}

interface Y extends X{
	void fly();
}
class B implements A,X,Y{

	
	public void show() {
		System.out.println("In Show");
		
	}

	public void config() {
		System.out.println("In Config");
	}

	public void run() {
		System.out.println("In Run...");
		
	}

	public void fly() {

		System.out.println("Flying...");
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.show();
		obj.config();
		
		Y obj1 = new B();
		obj1.fly();
		obj1.run();
		
		System.out.println(A.area );

	}

}
