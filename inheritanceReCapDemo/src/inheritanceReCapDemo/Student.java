package inheritanceReCapDemo;

public class Student extends User{

	private String studentNumber;

	public Student() {
		super();
	}

	public Student(int id, String name, String studentNumber) {
		super(id, name);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
