package polymorphism.in;

class calc{
	public int add(int n1,int n2) {
		return n1+n2;
	}
}
class AdavancedCalc extends calc{
	//Method Overloading or CompileTime
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdavancedCalc obj1 = new AdavancedCalc();
		int r1 = obj1.add(5,5,5);
		int r2 = obj1.add(5,5);
		
		System.out.println(r1+"  / "+r2);
		
		

	}

}
