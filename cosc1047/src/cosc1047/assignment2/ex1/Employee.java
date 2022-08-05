package cosc1047.assignment2.ex1;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
    public String toString(){
        return "Class: Employee, Name: " + getName();
    }
    
}
