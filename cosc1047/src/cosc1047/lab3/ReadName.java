package cosc1047.lab3;
import java.util.*;
import java.io.*;

public class ReadName {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(new File("scores.txt"))){
			String firstName = s.next();
			String middleName = s.next();
			String lastName = s.next();
			double score = s.nextDouble();
			System.out.printf("%s %s %s\nScore: %f", firstName, middleName, lastName, score);
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}

}
