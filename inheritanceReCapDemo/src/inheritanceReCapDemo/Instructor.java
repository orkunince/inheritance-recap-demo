package inheritanceReCapDemo;

public class Instructor extends User{

	private double salary;
	private double totalCourseHours;
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id, String name, double totalCourseHours) {
		super(id,name);
		this.totalCourseHours = totalCourseHours;
	}
	
	public double getTotalCourseHours() {
		return totalCourseHours;
	}
	public void setTotalCourseHours(double totalCourseHours) {
		this.totalCourseHours = totalCourseHours;
	}
	
	public double getSalary() {
		return getTotalCourseHours()*100;
	}
	
	
	
	
	
	
}
