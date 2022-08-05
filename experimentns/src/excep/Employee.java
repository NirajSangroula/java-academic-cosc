package excep;

public class Employee {
	
	private int idNum;
	private double hourlyWage;

	public Employee(int idNum, double hourlyWage) {
		if(hourlyWage < 6 || hourlyWage > 50)
			throw new EmployeeException(idNum + " " + hourlyWage);
		this.idNum = idNum;
		this.hourlyWage = hourlyWage;
	}
	
	

}
