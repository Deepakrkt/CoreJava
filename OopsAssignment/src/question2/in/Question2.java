package question2.in;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Manager("Deepak", 100, 200);
        Employee emp2 = new Labour("Aditya", 50, 100);
        
        double totalSalary = emp1.calculateSalary() + emp2.calculateSalary();
        
        System.out.println("Total salary: "+ totalSalary);

	}

}
