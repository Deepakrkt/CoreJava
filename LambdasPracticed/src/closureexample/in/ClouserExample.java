package closureexample.in;

interface Process {
	
	void process(int i);
	static void doProcess(int i, Process p) {
		p.process(i);
	}
}


public class ClouserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 40;
		
		Process.doProcess(a, i -> System.out.println(i+b));
		

	}
	

}

