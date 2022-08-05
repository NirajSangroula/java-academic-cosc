package excep;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Employee e1 = new Employee(1, 4);
		}
		catch(EmployeeException e) {
			System.out.println("Employee error" + e.getMessage());
		}

		try {
			Employee e1 = new Employee(1, 7);
		}
		catch(EmployeeException e) {
			System.out.println("Employee error" + e.getMessage());
		}
		

		try {
			Employee e1 = new Employee(1, 56);
		}
		catch(EmployeeException e) {
			System.out.println("Employee error" + e.getMessage());
		}
	}

}
