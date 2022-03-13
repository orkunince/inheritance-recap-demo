package inheritanceReCapDemo;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student(1,"Orkun","111111");
		
		Instructor instructor=new Instructor(1,"Engin Demiroğ",128);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);

	}

}
