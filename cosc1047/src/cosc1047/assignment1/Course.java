package cosc1047.assignment1;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(students.length <= numberOfStudents){
            String[] s = new String[numberOfStudents * 2];
            for(int i = 0; i < numberOfStudents; i++)
                s[i] = this.students[i];
            students = s;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents(){
        String[] students = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++)
            students[i] = this.students[i];
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        String[] s = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++){
        	//Whenever, i is to be removed, 
            if(students[i].equals(student)){
                for(int j = 0; j < numberOfStudents - 1; j++){
                    if(j < i)
                        s[j] = students[j];
                    else
                        s[j] = students[j + 1];
                }
                students = s;
                numberOfStudents--;
                return;
            }
        }
    }

    public void clear(){
        students = new String[10];
        numberOfStudents = 0;
    }
}