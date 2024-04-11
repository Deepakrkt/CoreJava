package iteratorpracticed.in;

public class Student {
	
	private Integer rollNumber;
	private String studName;
	private Integer studId;
	public Student(Integer rollNumber, String studName, Integer studId) {
		super();
		this.rollNumber = rollNumber;
		this.studName = studName;
		this.studId = studId;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studName=" + studName + ", studId=" + studId + "]";
	}
	
	

}
