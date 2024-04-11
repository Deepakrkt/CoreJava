package encapsulation.in;

// data + method binding together is called Encapsulation;
class Human{
	private int age;
	private String name;
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

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj1 = new Human();
		obj1.setAge(23);
		obj1.setName("Deepak");
		System.out.println(obj1.getAge()+ " "+ obj1.getName());
		
	}

}
