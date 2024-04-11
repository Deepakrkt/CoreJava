package constructor.in;

class Human{
	private int age;
	private String name;
	
	
	public Human() { // Default Constructor
		age = 12;
		name = "Sonu";
		System.out.println("Constructor");
	}
	public Human(int age, String name) { // parametrized constructor
		this.age = age;
		this.name = name;
		
		}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj1 = new Human();
		Human obj2 = new Human(20,"Deepak");
		
		System.out.println(obj1.getAge()+" "+obj1.getName());
		System.out.println(obj2.getAge()+" "+obj2.getName());

	}

}
