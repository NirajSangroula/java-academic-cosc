package cosc1047.assignment1;

public class Runner2 {

	public static void main(String[] args) {
		Course course = new Course("COSC 1047");
		System.out.println("Course : " + course.getCourseName());
		course.addStudent("Dipan");
		course.addStudent("Akash");
		course.addStudent("Ankit");
		System.out.println("Student: ");
		for(int i = 0; i < course.getNumberOfStudents(); i++){
			System.out.println(i + " " + course.getStudents()[i]);
		}
		course.dropStudent("Dipan");
		System.out.println("After dropping Dipan, ");
		for(int i = 0; i < course.getNumberOfStudents(); i++){
			System.out.println(i + " " + course.getStudents()[i]);
		}
	}
}