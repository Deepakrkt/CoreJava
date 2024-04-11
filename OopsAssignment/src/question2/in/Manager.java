package question2.in;

class Manager extends Employee {
    protected double incentive;

    public Manager(String name, double baseSalary, double incentive) {
        super(name, baseSalary);
        this.incentive = incentive;
    }

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		 return baseSalary + incentive;
	}

    
}
