package cosc1047.assignment2.ex1;

public class Staff extends Employee{
    private String title;
    public Staff(String title){
        this.setTitle(title);
    }

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
    public String toString(){
        return "Class: Staff, Name: " + getName();
    }
}
