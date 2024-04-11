package question2.in;

class Labour extends Employee {
	
	protected double overtime;
	
	public Labour(String name, double baseSalary, double overtime) {
		super(name, baseSalary);
		this.overtime = overtime;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary + overtime;
	}
	
}
