package interfacee.in;


interface Computer{
	void code();
}
class Laptop implements Computer{
	public void code() {
		System.out.println("code, compile, run..");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("code, compile, run.., faster...");
	}
}

class Devloper{
	public void devApp(Computer lap) {
		lap.code();
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lap = new Laptop();
		Desktop desk = new Desktop();
		
		Devloper devloper = new Devloper();
		devloper.devApp(desk);

	}

}
