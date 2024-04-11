package mappracticed.in;

public class Department {
	
	private Integer deptId;
	private String deptName;
	private String location;
	public Department(Integer deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	

}
