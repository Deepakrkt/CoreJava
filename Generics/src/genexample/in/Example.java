package genexample.in;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericClass<Integer> obj1 = new MyGenericClass<Integer>();
		obj1.setObject(1000);
		Integer ix = obj1.getObject();
		System.out.println(ix);
		
		MyGenericClass<String> obj2 = new MyGenericClass<String>();
		obj2.setObject("Jhon");
		String iy = obj2.getObject();
		System.out.println(iy);
		
		MyGenericClass<Double> obj3 = new MyGenericClass<Double>();
		obj3.setObject(111.11);
		Double iz = obj3.getObject();
		System.out.println(iz);

	}

}
