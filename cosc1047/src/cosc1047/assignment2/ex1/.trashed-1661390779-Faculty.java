package cosc1047.assignment2.ex1;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;
    public Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
    public String toString(){
        return "Class: Faculty, Name: " + getName();
    }

}
