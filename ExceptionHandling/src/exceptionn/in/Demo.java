package exceptionn.in;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		int j = 0;
		
		String str = null;
		int num[] = new int[5];
		
		try {
			j = 18/i;
			System.out.println(str.length());
			System.out.println(num[1]);
			System.out.println(num[5]);
			
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Something went wrong.."+ e);
		}
	    catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Stay in your Limit..."+ e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong.."+e);
		}
		
		System.out.println(j);
		System.out.println("The End");

	}

}
