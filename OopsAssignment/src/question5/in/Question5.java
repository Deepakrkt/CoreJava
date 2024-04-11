package question5.in;

abstract class Shape{
	public abstract void draw();
}
class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape is Rectangle");
		
	}
	
}

class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape is Line");
	}
	
}

class Cube extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape is Cube");

		
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle();
		Shape line = new Line();
		Shape cube = new Cube();
		
		//invoke all shape
		rectangle.draw();
		line.draw();
		cube.draw();

	}

}
