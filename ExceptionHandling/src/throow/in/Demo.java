package throow.in;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0)
				throw new HeyException("I dont want to print Zero");
		} 
		catch (HeyException e) {
			// TODO: handle exception
			j = 18/1;
			System.out.println("Thats the default output.."+ e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong.."+e);
		}
		
		System.out.println(j);
		System.out.println("The End");

	}

}
