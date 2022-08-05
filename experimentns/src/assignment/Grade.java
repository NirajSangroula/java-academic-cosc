package assignment;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("Enter a letter grade A, B, C, D, or F:");
		Scanner scanner = new Scanner(System.in);
		char grade = scanner.nextLine().charAt(0);
		int value;
		if(grade == 'A')
			value = 4;
		else if(grade == 'B')
			value = 3;
		else if(grade == 'C')
			value = 2;
		else if(grade == 'D')
			value = 1;
		else if(grade == 'F')
			value = 0;
		else
			value = -1;
		if(value != -1)
			System.out.println("The numeric value for grade " + grade + " is " + value);
		else
			System.out.println("Invalid input");
		scanner.close();
		
		
	}

}
