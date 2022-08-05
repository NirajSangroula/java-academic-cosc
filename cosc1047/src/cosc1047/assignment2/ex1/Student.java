package cosc1047.assignment2.ex1;

public class Student extends Person {
	private final String status;
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	public Student(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString(){
		return "Class: Student, Name: " + getName();
	}
}
