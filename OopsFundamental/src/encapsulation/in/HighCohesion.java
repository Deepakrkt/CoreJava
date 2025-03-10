package encapsulation.in;

class Dog{
	public void bark() {
		System.out.println("Bow Bow");
	}
}
class Cat{
	public void meow() {
		System.out.println("Meow Meow");
	}
}
class Cow{
	public void bow() {
		System.out.println("Meow Meow");
	}
}
class Animal{
	void doEverything() {
		new Dog().bark();
		new Cat().meow();
		new Cow().bow();
	}
}



public class HighCohesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal objAnimal = new Animal();
		objAnimal.doEverything();

	}

}
// This is a better way approaching the problem . Different classes have their own responsibilities.
