package functional.in;

@FunctionalInterface
interface A{
	void show();
//	void fly();
}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = () ->  System.out.println("This is functional Interface example");
		objA.show();

	}

}
