package encapsulation.in;

class DownloadAndStore{
	public void name() {
		System.out.print("Deepak");
		
	}
	public void midName() {
		System.out.print(" Kumar");
		
	}
	public void lastName() {
		System.out.print(" Yadav");
		
	}
	public void doEverything() {
		name();
		midName();
		lastName();
		
	}
	
}

public class Cohesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DownloadAndStore obj1 = new DownloadAndStore();
		obj1.doEverything();

	}

}
// Cohesion is a measaur of how related the responsibilities of a class are.
//This is not cohesion
