package inheritance.in;



class Calc{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
}
	
	class AdvanceCalc extends Calc{
		public int multi(int n1,int n2) {
			return n1*n2;
		}
		public int div(int n1,int n2) {
			return n1/n2;
		}
		
	}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceCalc obj = new AdvanceCalc();
		int r1 = obj.add(5, 1);
		int r2 = obj.sub(5, 1);
		int r3 = obj.multi(5, 5);
		int r4 = obj.div(5, 5);
		System.out.println("Add = "+r1+" ; "+"Sub = "+r2+" Milti = "+r3+" ; "+"Divide = "+r4+";" );
		
		
		

	}

}
