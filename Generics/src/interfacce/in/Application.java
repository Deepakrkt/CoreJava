package interfacce.in;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GClassImp<Integer> obj1 = new GClassImp<Integer>();
		obj1.setValue(100);
		Integer result = obj1.getValue();
		System.out.println(result);

	}

}
