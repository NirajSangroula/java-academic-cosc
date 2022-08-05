package cosc1047.assignment2.ex1;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("Niraj Sangroula", "66 Prouse Dr", "647-979-3571", "sangroulaniraj16@gmail.com");
		System.out.println(p);
		Student s = new Student(Student.SOPHOMORE);
		s.setName("Akash Khatri");
		System.out.println(s);
		Employee e = new Employee();
		e.setName("Ankit Neupane");
		System.out.println(e);
		Faculty f = new Faculty("9pm - 4pm", "2");
		f.setName("Dipan Bhusal");
		System.out.println(f);
		Staff st = new Staff("Gardener");
		st.setName("James Potter");
		System.out.println(st);
	}

}
