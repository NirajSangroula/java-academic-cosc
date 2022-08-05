package assignment;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		//Input Year and Month
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year and month:");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		if(month < 1 || month > 12) {
			System.err.println("Invalid month");
			System.exit(1);
		}
		String monthName = null;
		boolean isLeapYear = year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0);
		switch(month) {
		case 1: monthName = "January";break;
		case 2: monthName = "February";break;
		case 3: monthName = "March";break;
		case 4: monthName = "April";break;
		case 5: monthName = "May";break;
		case 6: monthName = "June";break;
		case 7: monthName = "July";break;
		case 8: monthName = "August";break;
		case 9: monthName = "September";break;
		case 10: monthName = "October";break;
		case 11: monthName = "November";break;
		case 12: monthName = "December";break;
		}
		
		System.out.printf("%s %d has ", monthName, year);
		switch(month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print(31);break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print(30);break;
		case 2: System.out.print(isLeapYear ? 29 : 28); break;
		}
		System.out.print(" days");
		scanner.close();
	}

}
