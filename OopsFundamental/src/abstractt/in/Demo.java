package abstractt.in;

abstract class Car{
	public abstract void drive(); // declare abstract method
	public abstract void fly();
	
	public void music() {
		System.out.println("Playing Music....");
	}
}

abstract class WagonR extends Car{
	
	
	public void drive() {
		System.out.println("Car Driving...");
	}
}
class UpdatedWagonR extends WagonR{
	public void fly() {
		System.out.println("Flying....");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new UpdatedWagonR();
		obj1.drive();
		obj1.fly();
		obj1.music();

	}

}
